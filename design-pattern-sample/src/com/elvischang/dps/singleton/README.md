# Singleton Pattern

1. Eagerly Initialized Singleton
```java
public class EagerSingleton {

    private static final EagerSingleton instance = new EagerSingleton();

    // keep construct away from anyone.
    private EagerSingleton() {}

    private static EagerSingleton getInstance() {
        return instance;
    }
}
```

2. Eagerly Initialized Static Block Singleton
```java
public class EagerStaticBlockSingleton {

    private static final EagerStaticBlockSingleton instance;

    private EagerStaticBlockSingleton() {}

    static {
        try {
            instance = new EagerStaticBlockSingleton();
        } catch (Exception e) {
            throw e;
        }

    }

    private static EagerStaticBlockSingleton getInstance() {

        return instance;
    }
}
```

3. Lazily Initialized Singleton
   * Not thread-safe.
```java
public class LazySingleton {

    private static _3_LazySingleton instance;

    private LazySingleton() {}


    private static LazySingleton getInstance() {
        if (instance == null) {
            instance = new _3_LazySingleton();
        }
        return instance;
    }
}
```
4. Lazily Initialized Double-Checked Locking Singleton
   * thread-safe!
```java
public class LazyDoubleCheckSingleton {

    private static volatile LazyDoubleCheckSingleton instance;

    private LazyDoubleCheckSingleton() {

    }


    private static LazyDoubleCheckSingleton getInstance() {
        if (instance == null) {
            synchronized (LazyDoubleCheckSingleton.class){
                if(instance == null){
                    instance = new LazyDoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}

```

5. Lazily Initialized Inner Class Singleton (Bill Pugh singleton)
   * thread-safe!
```java
public class LazyInnerClassSingleton {

    private LazyInnerClassSingleton() {

    }


    private static LazyInnerClassSingleton getInstance() {
       return InnerSingleton.INSTANCE;
    }

    private static class InnerSingleton{
        private static final LazyInnerClassSingleton INSTANCE = new LazyInnerClassSingleton();

    }
}
```

6. Enum Singleton
   * Can protect object from reflection. 
   * thread-safe!
```java
public enum EnumSingleton {

    INSTANCE;

    int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public static void main(String[] args) {
        EnumSingleton singleton = EnumSingleton.INSTANCE;

        System.out.println(singleton.getValue());
        singleton.setValue(2);
        System.out.println(singleton.getValue());
    }
}
```