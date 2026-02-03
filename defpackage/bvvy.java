package defpackage;

import com.google.android.rcs.client.messaging.data.ContentType;
import com.google.communication.synapse.security.scytale.MediaEncryptor;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bvvy {
    public static final cbtf a(MediaEncryptor mediaEncryptor, String str, fdap fdapVar) {
        eyfl eyflVarA = eyfk.a((eyfm) eyfn.a.createBuilder());
        eyflVarA.d(evqs.x(mediaEncryptor.getKeyMaterial()));
        eyflVarA.b(evqs.x(mediaEncryptor.getDigest()));
        eyflVarA.e(mediaEncryptor.getVersion());
        Object objFM = new atal().fH().fM(ContentType.e(str));
        objFM.getClass();
        eyflVarA.c((aubx) objFM);
        fdapVar.invoke(eyflVarA);
        return new cbte(eyflVarA.a());
    }
}
