package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.communication.synapse.security.scytale.MediaEncryptor;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvvz implements cbtk {
    private final Context a;
    private final cqms b;
    private final eygg c;

    public bvvz(Context context, cqms cqmsVar, eygg eyggVar) {
        context.getClass();
        eyggVar.getClass();
        this.a = context;
        this.b = cqmsVar;
        this.c = eyggVar;
    }

    private final MediaEncryptor c() {
        this.c.b();
        Object objA = bwlb.a(MediaEncryptor.createEncryptorInstance());
        objA.getClass();
        return (MediaEncryptor) objA;
    }

    @Override // defpackage.cbtk
    public final cbti a(byte[] bArr, String str) {
        MediaEncryptor mediaEncryptorC = c();
        byte[] bArr2 = (byte[]) bwlb.a(mediaEncryptorC.encrypt(bArr, true));
        bArr2.getClass();
        return new cbti(evwm.a(bArr2), bvvy.a(mediaEncryptorC, str, new fdap() { // from class: bvvx
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                ((eyfl) obj).getClass();
                return fctx.a;
            }
        }));
    }

    @Override // defpackage.cbtk
    public final cbtj b(Uri uri, final String str, String str2) throws IOException {
        MediaEncryptor mediaEncryptorC = c();
        epqr epqrVar = new epqr(this.b.a(uri), mediaEncryptorC, 1);
        try {
            Uri uriG = bxlf.g(epqrVar, this.a);
            fczl.a(epqrVar, null);
            uriG.getClass();
            return new cbtj(uriG, bvvy.a(mediaEncryptorC, str2, new fdap() { // from class: bvvw
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    eyfl eyflVar = (eyfl) obj;
                    eyflVar.getClass();
                    eyfm eyfmVar = eyflVar.a;
                    eyfmVar.copyOnWrite();
                    eyfn eyfnVar = (eyfn) eyfmVar.instance;
                    eyfn eyfnVar2 = eyfn.a;
                    eyfnVar.b |= 8;
                    eyfnVar.f = str;
                    return fctx.a;
                }
            }));
        } finally {
        }
    }
}
