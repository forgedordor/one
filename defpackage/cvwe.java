package defpackage;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvwe implements cvwc {
    public final Context a;
    public final arpr b;
    private final fdjx c;
    private final fdpl d;
    private final fcsu e;
    private final fcsu f;
    private final fcsu g;
    private final fcsu h;
    private final fcsu i;
    private final fcsu j;
    private final fcsu k;

    public cvwe(Context context, fdjx fdjxVar, fdpl fdplVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, arpr arprVar) {
        context.getClass();
        fdjxVar.getClass();
        fdplVar.getClass();
        arprVar.getClass();
        this.a = context;
        this.c = fdjxVar;
        this.d = fdplVar;
        this.e = fcsuVar;
        this.f = fcsuVar2;
        this.g = fcsuVar3;
        this.h = fcsuVar4;
        this.i = fcsuVar5;
        this.j = fcsuVar6;
        this.k = fcsuVar7;
        this.b = arprVar;
    }

    @Override // defpackage.cvwc
    public final fdpl a() {
        fdpl fdplVarA = auyk.a(this.d, "ConversationProperties");
        fdpl fdplVarA2 = auyk.a(((vis) this.f.b()).e, "EditGroupNameAction");
        fdpl fdplVarA3 = auyk.a(((vky) this.e.b()).c, "NotificationSettingsAction");
        fdpl fdplVarA4 = auyk.a(((vkk) this.g.b()).l, "LeaveGroupAction");
        fdpl fdplVarA5 = auyk.a(((vkv) this.k.b()).n, "LeaveGroupV2Action");
        fdpl fdplVarA6 = auyk.a(((vfe) this.h.b()).a, "BlockAndReportSpamAction");
        fdpl fdplVarA7 = auyk.a(((xrd) this.i.b()).d, "CustomThemesActionPlugin");
        fdpl fdplVarA8 = auyk.a(((agib) this.j.b()).a, "MuteSettingsActionPlugin");
        cvwd cvwdVar = new cvwd(this, null);
        long j = fdhi.a;
        long jF = fdhk.f(10, fdhl.d);
        fdpl[] fdplVarArr = {fdplVarA, fdplVarA2, fdplVarA3, fdplVarA4, fdplVarA5, fdplVarA6, fdplVarA7, fdplVarA8};
        boolean[] zArr = new boolean[8];
        for (int i = 0; i < 8; i++) {
            zArr[i] = false;
        }
        ArrayList arrayList = new ArrayList(8);
        int i2 = 0;
        int i3 = 0;
        while (i2 < 8) {
            arrayList.add(new fdtm(fdplVarArr[i2], new auzu(zArr, i3, null)));
            i2++;
            i3++;
        }
        return new fdqz(new auyv(this.c, jF, fdplVarArr, zArr, null), new auzx((fdpl[]) fcva.ao(arrayList).toArray(new fdpl[0]), cvwdVar));
    }
}
