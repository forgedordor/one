package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class erfx extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    protected final /* synthetic */ Object initialValue() throws IllegalAccessException, NoSuchMethodException, NoSuchAlgorithmException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        SecureRandom secureRandomA = erfy.a();
        secureRandomA.nextLong();
        return secureRandomA;
    }
}
