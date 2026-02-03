package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kou extends fdcy {
    final /* synthetic */ kov a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kou(kov kovVar, kpr kprVar) {
        super(kprVar);
        this.a = kovVar;
    }

    @Override // defpackage.fdcy
    public final /* bridge */ /* synthetic */ void a(fdeh fdehVar, Object obj, Object obj2) {
        kqp kqpVarA;
        kpr kprVar = (kpr) obj2;
        String strB = fdehVar.b();
        kprVar.getClass();
        kps kpsVar = kprVar.b;
        if (kpsVar.b() && kprVar.c.b()) {
            kqpVarA = kprVar.a.a();
        } else {
            kqt kqtVar = new kqt(new char[0]);
            if (!kpsVar.b()) {
                kqtVar.r("min", kpsVar.a());
            }
            kps kpsVar2 = kprVar.c;
            if (!kpsVar2.b()) {
                kqtVar.r("max", kpsVar2.a());
            }
            kqtVar.r(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.VALUE, kprVar.a.a());
            kqpVarA = kqtVar;
        }
        this.a.b.r(strB, kqpVarA);
    }
}
