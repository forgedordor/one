package defpackage;

import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etbm extends etbi {
    static final Map a;
    private final Constructor b;
    private final Object[] c;
    private final Map d;

    static {
        HashMap map = new HashMap();
        map.put(Byte.TYPE, (byte) 0);
        map.put(Short.TYPE, (short) 0);
        map.put(Integer.TYPE, 0);
        map.put(Long.TYPE, 0L);
        map.put(Float.TYPE, Float.valueOf(0.0f));
        map.put(Double.TYPE, Double.valueOf(0.0d));
        map.put(Character.TYPE, (char) 0);
        map.put(Boolean.TYPE, false);
        a = map;
    }

    public etbm(Class cls, etbl etblVar, boolean z) throws SecurityException {
        super(etblVar);
        this.d = new HashMap();
        etcs etcsVar = etcv.a;
        Constructor constructorA = etcsVar.a(cls);
        this.b = constructorA;
        if (z) {
            ReflectiveTypeAdapterFactory.b(null, constructorA);
        } else {
            etcv.g(constructorA);
        }
        String[] strArrD = etcsVar.d(cls);
        for (int i = 0; i < strArrD.length; i++) {
            this.d.put(strArrD[i], Integer.valueOf(i));
        }
        Class<?>[] parameterTypes = this.b.getParameterTypes();
        this.c = new Object[parameterTypes.length];
        for (int i2 = 0; i2 < parameterTypes.length; i2++) {
            this.c[i2] = a.get(parameterTypes[i2]);
        }
    }

    @Override // defpackage.etbi
    public final /* bridge */ /* synthetic */ Object c() {
        return (Object[]) this.c.clone();
    }

    @Override // defpackage.etbi
    public final /* bridge */ /* synthetic */ void f(Object obj, etdb etdbVar, etbj etbjVar) {
        Map map = this.d;
        String str = etbjVar.i;
        Object[] objArr = (Object[]) obj;
        Integer num = (Integer) map.get(str);
        if (num == null) {
            throw new IllegalStateException(a.d(str, etcv.c(this.b), "Could not find the index in the constructor '", "' for field with name '", "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters."));
        }
        etbjVar.a(etdbVar, num.intValue(), objArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.etbi
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Object e(Object[] objArr) {
        try {
            return this.b.newInstance(objArr);
        } catch (IllegalAccessException e) {
            throw etcv.b(e);
        } catch (IllegalArgumentException e2) {
            e = e2;
            throw new RuntimeException("Failed to invoke constructor '" + etcv.c(this.b) + "' with args " + Arrays.toString(objArr), e);
        } catch (InstantiationException e3) {
            e = e3;
            throw new RuntimeException("Failed to invoke constructor '" + etcv.c(this.b) + "' with args " + Arrays.toString(objArr), e);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException("Failed to invoke constructor '" + etcv.c(this.b) + "' with args " + Arrays.toString(objArr), e4.getCause());
        }
    }
}
