package defpackage;

import android.content.Context;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csmr implements eyif {
    public static lkb a(final Context context, fdjx fdjxVar) throws IOException {
        context.getClass();
        fdjxVar.getClass();
        eieu eieuVarH = eiiy.h("SpatulaAccountDataModule.provideSpatulaAccountDataStore");
        try {
            csmn csmnVar = (csmn) csmo.a.createBuilder();
            csmnVar.getClass();
            lkb lkbVarA = lkc.a(new lmj(csmp.a(csmnVar)), null, fcvo.a, fdjxVar, new fdae() { // from class: csmq
                @Override // defpackage.fdae
                public final Object invoke() {
                    return ljo.a(context, "spatula.pb");
                }
            });
            fczl.a(eieuVarH, null);
            return lkbVarA;
        } finally {
        }
    }

    @Override // defpackage.fcsu
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
