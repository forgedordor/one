package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.spec.ECGenParameterSpec;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwds {
    public final Context a;
    public final dwcm b;
    public final dvjj c;

    public dwds(Context context, dwcm dwcmVar, dvjj dvjjVar) {
        this.a = context;
        this.b = dwcmVar;
        this.c = dvjjVar;
    }

    public static final ListenableFuture a() {
        return dvjq.a(new Callable() { // from class: dwdr
            @Override // java.util.concurrent.Callable
            public final Object call() throws NoSuchAlgorithmException, InvalidAlgorithmParameterException {
                KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC");
                keyPairGenerator.initialize(new ECGenParameterSpec("secp256r1"));
                return keyPairGenerator.generateKeyPair();
            }
        });
    }
}
