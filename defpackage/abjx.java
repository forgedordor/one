package defpackage;

import com.android.vcard.VCardConstants;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abjx implements abka {
    private final abto a;
    private final String b;

    public abjx(abto abtoVar, String str) {
        this.a = abtoVar;
        this.b = str;
    }

    @Override // defpackage.abka
    public final abto a(Map map) {
        cqce cqceVar = abjq.a;
        String strE = abmt.e(new abgl(this.b));
        cqbd cqbdVarC = abjq.a.c();
        cqbdVarC.I("Loading Ditto Satellite");
        cqbdVarC.A(VCardConstants.PROPERTY_URL, strE);
        cqbdVarC.r();
        abto abtoVar = this.a;
        abtoVar.e(strE, map);
        return abtoVar;
    }

    @Override // defpackage.abka
    public final void b() {
    }
}
