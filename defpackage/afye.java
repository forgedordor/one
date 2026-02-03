package defpackage;

import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afye extends fcyz implements fdaw {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    /* synthetic */ boolean d;
    final /* synthetic */ afyf e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afye(afyf afyfVar, fcxy fcxyVar) {
        super(5, fcxyVar);
        this.e = afyfVar;
    }

    @Override // defpackage.fdaw
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean zBooleanValue = ((Boolean) obj4).booleanValue();
        afye afyeVar = new afye(this.e, (fcxy) obj5);
        afyeVar.a = (String) obj;
        afyeVar.b = (List) obj2;
        afyeVar.c = (afvt) obj3;
        afyeVar.d = zBooleanValue;
        return afyeVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        dlnq dlnpVar;
        fctl.b(obj);
        Object obj2 = this.a;
        ?? r2 = this.b;
        Object obj3 = this.c;
        boolean z = this.d;
        List listB = z ? fcvo.a : fcva.b(this.e.h);
        final afyf afyfVar = this.e;
        dihq dihqVarB = afyfVar.b();
        if (z) {
            final afvt afvtVar = (afvt) obj3;
            dlnpVar = new dlnn((String) obj2, afyfVar.a.getString(R.string.search_hint_empty), true, new afyd(afyfVar.c), new fdae() { // from class: afyb
                @Override // defpackage.fdae
                public final Object invoke() {
                    List list = afvtVar.b;
                    if (!list.isEmpty()) {
                        djyu djyuVar = ((afwv) list.get(0)).a().a;
                        if (!(djyuVar instanceof djys)) {
                            throw new IllegalArgumentException("Unexpected ListItemUiData when clicking on Done button");
                        }
                        djys djysVar = (djys) djyuVar;
                        if (!djysVar.d) {
                            afyf afyfVar2 = afyfVar;
                            djysVar.f.invoke();
                            afyfVar2.g.f(false);
                        }
                    }
                    return fctx.a;
                }
            }, new dlnl(0, ((aqiu) afyfVar.f.b()).a(), 1));
        } else {
            String string = afyfVar.a.getString(R.string.multi_share_top_app_bar_title);
            string.getClass();
            dlnpVar = new dlnp(string, null, null, false, null, null, null, 254);
        }
        return new afyi(new dloh(dlnpVar, dihqVarB, listB, false, false, null, null, 112), (afvt) obj3, r2, new afyh(afyfVar.e.a(), 2));
    }
}
