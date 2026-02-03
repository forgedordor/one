package defpackage;

import android.app.appsearch.EmbeddingVector;
import android.app.appsearch.GenericDocument;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aiq {
    static void a(afu<afu<?>> afuVar, String str, EmbeddingVector[] embeddingVectorArr) {
        int length = embeddingVectorArr.length;
        aft[] aftVarArr = new aft[length];
        for (int i = 0; i < embeddingVectorArr.length; i++) {
            aftVarArr[i] = new aft(embeddingVectorArr[i].getValues(), embeddingVectorArr[i].getModelSignature());
        }
        lcg.i(str);
        afu.l(str);
        for (int i2 = 0; i2 < length; i2++) {
            if (aftVarArr[i2] == null) {
                throw new IllegalArgumentException(a.e(i2, "The EmbeddingVector at ", " is null."));
            }
        }
        ajo ajoVar = afuVar.a;
        ajz ajzVar = new ajz(str);
        ajzVar.b = aftVarArr;
        ajoVar.b(str, ajzVar.a());
        afu afuVar2 = afuVar.b;
    }

    static void b(GenericDocument.Builder<GenericDocument.Builder<?>> builder, String str, aft[] aftVarArr) {
        EmbeddingVector[] embeddingVectorArr = new EmbeddingVector[aftVarArr.length];
        for (int i = 0; i < aftVarArr.length; i++) {
            aft aftVar = aftVarArr[i];
            embeddingVectorArr[i] = new EmbeddingVector(aftVar.a, aftVar.b);
        }
        builder.setPropertyEmbedding(str, embeddingVectorArr);
    }
}
