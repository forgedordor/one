package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class efpv extends efot {
    static final ejvj a = new efpo();

    @Override // defpackage.efot
    public final void c(efiv efivVar, cjhj cjhjVar) {
        cjhk cjhkVar = (cjhk) cjhl.a.createBuilder();
        String string = efivVar.a().toString();
        cjhkVar.copyOnWrite();
        cjhl cjhlVar = (cjhl) cjhkVar.instance;
        string.getClass();
        cjhlVar.b |= 1;
        cjhlVar.c = string;
        cjhjVar.copyOnWrite();
        cjhm cjhmVar = (cjhm) cjhjVar.instance;
        cjhl cjhlVar2 = (cjhl) cjhkVar.build();
        cjhm cjhmVar2 = cjhm.a;
        cjhlVar2.getClass();
        cjhmVar.d = cjhlVar2;
        cjhmVar.b |= 2;
    }

    @Override // defpackage.efot
    public final void d(cjhm cjhmVar, efiu efiuVar) {
        cjhl cjhlVar = cjhmVar.d;
        if (cjhlVar == null) {
            cjhlVar = cjhl.a;
        }
        Uri uri = Uri.parse(cjhlVar.c);
        if (uri == null) {
            throw new NullPointerException("Null contentUri");
        }
        ((efhm) efiuVar).b = uri;
    }
}
