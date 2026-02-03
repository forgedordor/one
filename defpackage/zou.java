package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zou implements zop {
    public final Context a;
    public final fdjx b;
    public final ajmh c;
    public final yjk d;
    public final cpfu e;
    public final ahnx f;
    private final fdpl g;
    private final zon h;
    private final fcsu i;
    private final fctc j;

    public zou(Context context, fdjx fdjxVar, ajmh ajmhVar, fdpl fdplVar, yjk yjkVar, ahnx ahnxVar, zon zonVar, cpfu cpfuVar, fcsu fcsuVar) {
        context.getClass();
        fdjxVar.getClass();
        ajmhVar.getClass();
        fdplVar.getClass();
        ahnxVar.getClass();
        zonVar.getClass();
        cpfuVar.getClass();
        fcsuVar.getClass();
        this.a = context;
        this.b = fdjxVar;
        this.c = ajmhVar;
        this.g = fdplVar;
        this.d = yjkVar;
        this.f = ahnxVar;
        this.h = zonVar;
        this.e = cpfuVar;
        this.i = fcsuVar;
        this.j = fctd.a(new fdae() { // from class: zoq
            @Override // defpackage.fdae
            public final Object invoke() {
                zou zouVar = this.a;
                return fdtg.a(anov.a(zouVar.c.k()), zouVar.b, fdur.a, 1);
            }
        });
    }

    @Override // defpackage.zop
    public final fdvc a() {
        fduj fdujVar = (fduj) this.j.a();
        fdpl fdplVarA = ((ygs) this.i.b()).a();
        zot zotVar = new zot(this, null);
        fdpl fdplVar = this.g;
        fduf fdufVar = this.h.a;
        fdpl fdplVarB = fdud.b(fdujVar, fdplVar, fdufVar, fdplVarA, zotVar);
        fdus fdusVar = fdur.a;
        int i = ekgb.d;
        ekgb ekgbVar = ekoe.a;
        ekgbVar.getClass();
        String string = this.a.getString(R.string.scheduled_messages_list_button_text, 0);
        string.getClass();
        return fdtg.b(fdplVarB, this.b, fdusVar, new zov(ekgbVar, new djpe(string, ((Boolean) fdufVar.c()).booleanValue(), new zor(this))));
    }

    public final void b() {
        this.h.a.f(Boolean.valueOf(!((Boolean) r0.c()).booleanValue()));
    }
}
