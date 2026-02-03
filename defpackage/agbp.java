package defpackage;

import android.content.Context;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agbp implements afyw {
    private final Context a;
    private final avbr b;

    public agbp(Context context, avbr avbrVar) {
        avbrVar.getClass();
        this.a = context;
        this.b = avbrVar;
    }

    @Override // defpackage.afyw
    public final /* bridge */ /* synthetic */ Object a(afzv afzvVar, fcxy fcxyVar) {
        agbo agboVar = (agbo) afzvVar;
        Uri uri = agboVar.a;
        if (uri != null) {
            this.b.d(this.a, uri, agboVar.d, agboVar.c);
        } else {
            alqm alqmVar = agboVar.b;
            if (alqmVar == null) {
                throw new IllegalArgumentException("Either contactUri or identity must be set.");
            }
            this.b.c(this.a, alqmVar, agboVar.d, agboVar.c);
        }
        return fctx.a;
    }
}
