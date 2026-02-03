package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.messaging.R;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class baiy extends bajr implements bxgq {
    private final Context a;
    private final Uri b;
    private final baix d;
    private final bxgr e;
    private String f;
    private final babw g = new babw();
    private bxfi h;
    private final Uri i;
    private final bxff j;

    public baiy(Context context, baix baixVar, cpbn cpbnVar, bxgr bxgrVar, bxff bxffVar, Uri uri) {
        this.a = context;
        this.f = context.getString(R.string.loading_vcard);
        this.b = uri;
        this.d = baixVar;
        this.e = bxgrVar;
        this.j = bxffVar;
        this.i = cpbnVar.a();
    }

    @Override // defpackage.bajr
    public final long a() {
        return -1L;
    }

    @Override // defpackage.bajr
    public final long b() {
        return -1L;
    }

    @Override // defpackage.bajr
    public final Intent c() {
        return null;
    }

    @Override // defpackage.bajr
    public final Uri d() {
        if (!q()) {
            return this.i;
        }
        List list = this.h.a;
        cqaz.k(!list.isEmpty());
        baix baixVar = this.d;
        cqaz.l(list);
        cqaz.k(!list.isEmpty());
        if (list.size() == 1) {
            return baixVar.a((bxfm) list.get(0));
        }
        int iMin = Math.min(list.size(), 4);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(baixVar.a((bxfm) list.get(i)));
        }
        return cpbr.p(baixVar.a, arrayList);
    }

    @Override // defpackage.bajr
    public final Optional e() {
        return Optional.empty();
    }

    @Override // defpackage.bxgq
    public final void fU(bxgk bxgkVar) {
        bajq bajqVar;
        this.g.d();
        this.f = this.a.getString(R.string.failed_loading_vcard);
        if (!i() || (bajqVar = this.c) == null) {
            return;
        }
        bajqVar.a(this);
    }

    @Override // defpackage.bxgq
    public final /* bridge */ /* synthetic */ void fV(bxgk bxgkVar, bxgz bxgzVar, boolean z) {
        bajq bajqVar;
        bxfi bxfiVar = (bxfi) bxgzVar;
        ejwl.a(this.h == null);
        this.g.d();
        this.f = this.a.getResources().getQuantityString(R.plurals.vcard_tap_hint_new, bxfiVar.a.size());
        this.h = bxfiVar;
        bxfiVar.p();
        if (!i() || (bajqVar = this.c) == null) {
            return;
        }
        bajqVar.b(this);
    }

    @Override // defpackage.babu
    public final void fY(String str) {
        super.fY(str);
        Uri uri = this.b;
        if (uri != null) {
            bxff bxffVar = this.j;
            babw babwVar = this.g;
            Context context = this.a;
            bxfg bxfgVar = (bxfg) bxffVar.a.b();
            bxfgVar.getClass();
            babwVar.c(new bxfe(bxfgVar, uri).f(context, this));
            this.e.d((bxgk) babwVar.a());
        }
    }

    @Override // defpackage.babu
    public final void g(String str) {
        super.g(str);
        if (this.b != null) {
            this.g.f();
            bxfi bxfiVar = this.h;
            if (bxfiVar != null) {
                bxfiVar.q();
                this.h = null;
            }
        }
    }

    @Override // defpackage.bajr
    public final Optional k() {
        return Optional.empty();
    }

    @Override // defpackage.bajr
    public final String l() {
        return this.f;
    }

    @Override // defpackage.bajr
    public final String m() {
        if (!q()) {
            return null;
        }
        List list = this.h.a;
        cqaz.k(!list.isEmpty());
        return list.size() == 1 ? ((bxfm) list.get(0)).d : this.a.getResources().getQuantityString(R.plurals.vcard_multiple_display_name, list.size(), Integer.valueOf(list.size()));
    }

    @Override // defpackage.bajr
    public final String n() {
        return null;
    }

    public final Uri o() {
        if (q()) {
            return this.b;
        }
        return null;
    }

    public final List p() {
        if (q()) {
            return this.h.a;
        }
        int i = ekgb.d;
        return ekoe.a;
    }

    public final boolean q() {
        return i() && this.h != null;
    }
}
