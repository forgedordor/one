package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdyn {
    public static final /* synthetic */ int a = 0;
    private static final int b = c(Throwable.class, -1);
    private static final fdyc c;

    static {
        fdyc fdycVar;
        try {
            fdycVar = fdyo.a ? fdzt.a : fdxv.a;
        } catch (Throwable unused) {
            fdycVar = fdzt.a;
        }
        c = fdycVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Throwable a(Throwable th) {
        Object objA;
        if (!(th instanceof fdjj)) {
            return (Throwable) c.a(th.getClass()).invoke(th);
        }
        try {
            objA = ((fdjj) th).a();
        } catch (Throwable th2) {
            objA = fctl.a(th2);
        }
        if (true == (objA instanceof fctj)) {
            objA = null;
        }
        return (Throwable) objA;
    }

    public static final fdap b(Class cls) throws SecurityException {
        Object next;
        fdap fdapVar;
        fcti fctiVar;
        fdym fdymVar = fdym.a;
        if (b == c(cls, 0)) {
            Constructor<?>[] constructors = cls.getConstructors();
            int length = constructors.length;
            ArrayList arrayList = new ArrayList(length);
            int i = 0;
            while (true) {
                next = null;
                if (i >= length) {
                    break;
                }
                final Constructor<?> constructor = constructors[i];
                Class<?>[] parameterTypes = constructor.getParameterTypes();
                int length2 = parameterTypes.length;
                if (length2 == 0) {
                    final fdap fdapVar2 = new fdap() { // from class: fdyl
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
                            int i2 = fdyn.a;
                            Object objNewInstance = constructor.newInstance(null);
                            objNewInstance.getClass();
                            Throwable th = (Throwable) objNewInstance;
                            th.initCause((Throwable) obj);
                            return th;
                        }
                    };
                    fctiVar = new fcti(new fdap() { // from class: fdyh
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj) {
                            Object objA;
                            Throwable th = (Throwable) obj;
                            int i2 = fdyn.a;
                            try {
                                Throwable th2 = (Throwable) fdapVar2.invoke(th);
                                boolean zF = fdbq.f(th.getMessage(), th2.getMessage());
                                objA = th2;
                                if (!zF) {
                                    boolean zF2 = fdbq.f(th2.getMessage(), th.toString());
                                    objA = th2;
                                    if (!zF2) {
                                        objA = null;
                                    }
                                }
                            } catch (Throwable th3) {
                                objA = fctl.a(th3);
                            }
                            return (Throwable) (true != (objA instanceof fctj) ? objA : null);
                        }
                    }, 0);
                } else if (length2 == 1) {
                    Class<?> cls2 = parameterTypes[0];
                    if (fdbq.f(cls2, String.class)) {
                        final fdap fdapVar3 = new fdap() { // from class: fdyj
                            @Override // defpackage.fdap
                            public final Object invoke(Object obj) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
                                Throwable th = (Throwable) obj;
                                int i2 = fdyn.a;
                                Object objNewInstance = constructor.newInstance(th.getMessage());
                                objNewInstance.getClass();
                                Throwable th2 = (Throwable) objNewInstance;
                                th2.initCause(th);
                                return th2;
                            }
                        };
                        fctiVar = new fcti(new fdap() { // from class: fdyh
                            @Override // defpackage.fdap
                            public final Object invoke(Object obj) {
                                Object objA;
                                Throwable th = (Throwable) obj;
                                int i2 = fdyn.a;
                                try {
                                    Throwable th2 = (Throwable) fdapVar3.invoke(th);
                                    boolean zF = fdbq.f(th.getMessage(), th2.getMessage());
                                    objA = th2;
                                    if (!zF) {
                                        boolean zF2 = fdbq.f(th2.getMessage(), th.toString());
                                        objA = th2;
                                        if (!zF2) {
                                            objA = null;
                                        }
                                    }
                                } catch (Throwable th3) {
                                    objA = fctl.a(th3);
                                }
                                return (Throwable) (true != (objA instanceof fctj) ? objA : null);
                            }
                        }, 2);
                    } else if (fdbq.f(cls2, Throwable.class)) {
                        final fdap fdapVar4 = new fdap() { // from class: fdyk
                            @Override // defpackage.fdap
                            public final Object invoke(Object obj) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
                                int i2 = fdyn.a;
                                Object objNewInstance = constructor.newInstance((Throwable) obj);
                                objNewInstance.getClass();
                                return (Throwable) objNewInstance;
                            }
                        };
                        fctiVar = new fcti(new fdap() { // from class: fdyh
                            @Override // defpackage.fdap
                            public final Object invoke(Object obj) {
                                Object objA;
                                Throwable th = (Throwable) obj;
                                int i2 = fdyn.a;
                                try {
                                    Throwable th2 = (Throwable) fdapVar4.invoke(th);
                                    boolean zF = fdbq.f(th.getMessage(), th2.getMessage());
                                    objA = th2;
                                    if (!zF) {
                                        boolean zF2 = fdbq.f(th2.getMessage(), th.toString());
                                        objA = th2;
                                        if (!zF2) {
                                            objA = null;
                                        }
                                    }
                                } catch (Throwable th3) {
                                    objA = fctl.a(th3);
                                }
                                return (Throwable) (true != (objA instanceof fctj) ? objA : null);
                            }
                        }, 1);
                    } else {
                        fctiVar = new fcti(null, -1);
                    }
                } else if (length2 != 2) {
                    fctiVar = new fcti(null, -1);
                } else if (fdbq.f(parameterTypes[0], String.class) && fdbq.f(parameterTypes[1], Throwable.class)) {
                    final fdap fdapVar5 = new fdap() { // from class: fdyi
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
                            Throwable th = (Throwable) obj;
                            int i2 = fdyn.a;
                            Object objNewInstance = constructor.newInstance(th.getMessage(), th);
                            objNewInstance.getClass();
                            return (Throwable) objNewInstance;
                        }
                    };
                    fctiVar = new fcti(new fdap() { // from class: fdyh
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj) {
                            Object objA;
                            Throwable th = (Throwable) obj;
                            int i2 = fdyn.a;
                            try {
                                Throwable th2 = (Throwable) fdapVar5.invoke(th);
                                boolean zF = fdbq.f(th.getMessage(), th2.getMessage());
                                objA = th2;
                                if (!zF) {
                                    boolean zF2 = fdbq.f(th2.getMessage(), th.toString());
                                    objA = th2;
                                    if (!zF2) {
                                        objA = null;
                                    }
                                }
                            } catch (Throwable th3) {
                                objA = fctl.a(th3);
                            }
                            return (Throwable) (true != (objA instanceof fctj) ? objA : null);
                        }
                    }, 3);
                } else {
                    fctiVar = new fcti(null, -1);
                }
                arrayList.add(fctiVar);
                i++;
            }
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int iIntValue = ((Number) ((fcti) next).b).intValue();
                    while (true) {
                        Object next2 = it.next();
                        int iIntValue2 = ((Number) ((fcti) next2).b).intValue();
                        int i2 = iIntValue < iIntValue2 ? iIntValue2 : iIntValue;
                        if (iIntValue < iIntValue2) {
                            next = next2;
                        }
                        if (!it.hasNext()) {
                            break;
                        }
                        iIntValue = i2;
                    }
                }
            }
            fcti fctiVar2 = (fcti) next;
            if (fctiVar2 != null && (fdapVar = (fdap) fctiVar2.a) != null) {
                return fdapVar;
            }
        }
        return fdymVar;
    }

    private static final int c(Class cls, int i) {
        Object objA;
        fdab.c(cls);
        int i2 = 0;
        do {
            try {
                int i3 = 0;
                for (Field field : cls.getDeclaredFields()) {
                    if (!Modifier.isStatic(field.getModifiers())) {
                        i3++;
                    }
                }
                i2 += i3;
                cls = cls.getSuperclass();
            } catch (Throwable th) {
                objA = fctl.a(th);
            }
        } while (cls != null);
        objA = Integer.valueOf(i2);
        Object objValueOf = Integer.valueOf(i);
        if (true == (objA instanceof fctj)) {
            objA = objValueOf;
        }
        return ((Number) objA).intValue();
    }
}
