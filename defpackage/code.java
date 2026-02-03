package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class code implements cnpf {
    private final cmfo a;
    private final codp b;

    public code(Context context, cmgk cmgkVar) {
        cmgg cmggVarC = cmgh.c();
        cmggVarC.d(cmfn.DRM_WIPEOUT_HEURISTIC);
        cmggVarC.f(codg.a);
        cmfo cmfoVarA = cmgkVar.a(cmggVarC.a());
        this.a = cmfoVarA;
        this.b = new codp(context, cmfoVarA);
    }

    private final void b() {
        this.b.a(Uri.parse("content://mms/drm"), new codo() { // from class: codd
            @Override // defpackage.codo
            public final Object a(Object obj, Uri uri, String str) {
                codf codfVar = (codf) ((codg) obj).toBuilder();
                String string = uri.toString();
                codfVar.copyOnWrite();
                codg codgVar = (codg) codfVar.instance;
                string.getClass();
                codgVar.b = string;
                codfVar.copyOnWrite();
                codg codgVar2 = (codg) codfVar.instance;
                str.getClass();
                codgVar2.c = str;
                return (codg) codfVar.build();
            }
        });
    }

    @Override // defpackage.cnpf
    public final Optional a() {
        try {
            codg codgVar = (codg) this.a.l();
            if (TextUtils.isEmpty(codgVar.b)) {
                b();
                return Optional.empty();
            }
            codp codpVar = this.b;
            Uri uri = Uri.parse(codgVar.b);
            String str = codgVar.c;
            Cursor cursorQuery = codpVar.b.getContentResolver().query(uri, new String[]{"_data"}, null, null, null, null);
            try {
                ejyb.e(cursorQuery);
                boolean z = false;
                if (cursorQuery.moveToNext() && cursorQuery.getString(0).equals(str)) {
                    z = true;
                }
                if (!z) {
                    cqbd cqbdVarC = codp.a.c();
                    cqbdVarC.I("Detected telephony wipeout. Clearing internal state of the table heuristic.");
                    cqbdVarC.r();
                    codpVar.c.n();
                }
                boolean z2 = !z;
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                if (!z) {
                    b();
                }
                return Optional.of(Boolean.valueOf(z2));
            } finally {
            }
        } catch (evtj e) {
            throw new RuntimeException("DrmTableBasedWipeoutDetectionHeuristic is unable to access data in the data store.", e);
        }
    }
}
