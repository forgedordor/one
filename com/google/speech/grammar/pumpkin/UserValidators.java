package com.google.speech.grammar.pumpkin;

import defpackage.exwq;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class UserValidators {
    public long a;
    private final Object b;

    public UserValidators(exwq exwqVar) {
        byte[] byteArray = exwqVar.toByteArray();
        this.b = new Object();
        this.a = nativeCreate(byteArray);
        new HashMap();
        if (this.a == 0) {
            throw new NullPointerException("Couldn't create UserValidator native object from the provided config");
        }
    }

    private native void nativeAddUserValidator(long j, String str, String[] strArr);

    private native long nativeCreate(byte[] bArr);

    private native void nativeDelete(long j);

    public final synchronized void a(String str, String[] strArr) {
        nativeAddUserValidator(this.a, str, strArr);
    }

    public final void b() {
        synchronized (this.b) {
            long j = this.a;
            if (j != 0) {
                nativeDelete(j);
                this.a = 0L;
            }
        }
    }

    protected final void finalize() {
        b();
    }
}
