package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bacr {
    private static final cqce o = cqce.g("BugleDataModel", "ContactListItemData");
    public long a;
    public long b;
    public String c;
    public long d;
    public String e;
    public String f;
    public Uri g;
    public ArrayList h;
    public qxf i;
    public CharSequence j;
    public boolean k;
    public boolean l;
    public boolean m;
    public final bacp n;
    private final Context p;
    private final cmvy q;
    private final cqiz r;
    private final cssf s;
    private final axjf t;

    public bacr(Context context, bacp bacpVar, cmvy cmvyVar, cqiz cqizVar, cssf cssfVar, axjf axjfVar) {
        this.p = context;
        this.n = bacpVar;
        this.q = cmvyVar;
        this.r = cqizVar;
        this.s = cssfVar;
        this.t = axjfVar;
    }

    private static boolean g(String str) {
        return TextUtils.isEmpty(str) || str.trim().length() == 0;
    }

    public final int a() {
        return this.h.size();
    }

    public final qxf b(bacq bacqVar) {
        alqm alqmVar = bacqVar.a;
        if (TextUtils.isEmpty(alqmVar.p(((Boolean) alrj.a.e()).booleanValue())) || !this.h.contains(bacqVar)) {
            throw new IllegalStateException(String.valueOf(cqcv.b(((alqk) alqmVar).o())).concat(" doesn't belong to this contact"));
        }
        qxf qxfVar = this.i;
        return qxfVar != null ? qxfVar : this.r.l(this.e, alqmVar, bacqVar.b, bacqVar.c, this.b, this.c, -1L, this.a, this.g, this.l);
    }

    public final bacq c(int i) {
        return (bacq) this.h.get(i);
    }

    public final String d(String str) {
        String string;
        if (!TextUtils.isEmpty(str)) {
            return this.s.d(str);
        }
        String strC = cssf.c(ejwk.b(((bacq) this.h.get(0)).a.F().a));
        return (!cpdz.a(this.b) || (string = this.p.getResources().getString(R.string.contact_list_send_to_text, strC)) == null) ? strC : string;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(android.database.Cursor r15) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bacr.e(android.database.Cursor):void");
    }

    public final Uri f() {
        return this.t.a(bbbd.r(b((bacq) this.h.get(0))));
    }
}
