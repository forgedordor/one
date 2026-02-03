package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wbv {
    public final Context a;
    public final wre b;
    public final ujl c;
    public final xgt d;
    public final dnih e;
    public final aqhu f;
    public final fdpl g;
    public final fctc h;
    public final fctc i;
    private final fctc j;

    public wbv(Context context, fduj fdujVar, wre wreVar, ujl ujlVar, xgt xgtVar, dnih dnihVar, aqhu aqhuVar) {
        context.getClass();
        fdujVar.getClass();
        wreVar.getClass();
        ujlVar.getClass();
        dnihVar.getClass();
        this.a = context;
        this.b = wreVar;
        this.c = ujlVar;
        this.d = xgtVar;
        this.e = dnihVar;
        this.f = aqhuVar;
        this.g = new wbs(fdujVar);
        this.h = fctd.a(new fdae() { // from class: wbj
            @Override // defpackage.fdae
            public final Object invoke() {
                return new wbu(this.a);
            }
        });
        this.j = fctd.a(new fdae() { // from class: wbk
            @Override // defpackage.fdae
            public final Object invoke() {
                wbv wbvVar = this.a;
                dpfy dpfyVar = new dpfy((wbu) wbvVar.h.a(), ((eoth) ((aqhl) wbvVar.f).a.b()).a("bugle.direct_send_v2_enable_rich_content_insertion") ? wbvVar.d.d() : null, wbvVar.c);
                String string = wbvVar.a.getString(R.string.direct_send_compose_row_hint);
                string.getClass();
                String str = ((vvw) wbvVar.b.a.c()).a;
                if (str == null) {
                    str = "";
                }
                return new djcv(dpfyVar, str, string, null, 4, true, null, null, 192);
            }
        });
        this.i = fctd.a(new fdae() { // from class: wbl
            @Override // defpackage.fdae
            public final Object invoke() {
                return this.a.a().a.f;
            }
        });
    }

    public final djcv a() {
        return (djcv) this.j.a();
    }
}
