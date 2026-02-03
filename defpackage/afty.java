package defpackage;

import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afty extends fcyz implements fdau {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    final /* synthetic */ aftz c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afty(aftz aftzVar, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.c = aftzVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        afty aftyVar = new afty(this.c, (fcxy) obj3);
        aftyVar.a = (List) obj;
        aftyVar.b = (afns) obj2;
        return aftyVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.Collection] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ?? r8 = this.a;
        if (((afns) this.b).a || r8.isEmpty()) {
            return null;
        }
        aftz aftzVar = this.c;
        String string = aftzVar.c.getString(R.string.multi_share_mirror_extended_fab_text);
        string.getClass();
        return new djpw(string, false, djrr.v, new aftx(aftzVar), 2);
    }
}
