package defpackage;

import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class viu extends fcyz implements fdav {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    final /* synthetic */ vix d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public viu(vix vixVar, fcxy fcxyVar) {
        super(4, fcxyVar);
        this.d = vixVar;
    }

    @Override // defpackage.fdav
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        viu viuVar = new viu(this.d, (fcxy) obj4);
        viuVar.a = (zqw) obj;
        viuVar.b = (wac) obj2;
        viuVar.c = (aoer) obj3;
        return viuVar.b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [aoer, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        Object obj2 = this.a;
        Object obj3 = this.b;
        ?? r3 = this.c;
        final vix vixVar = this.d;
        if (((Boolean) vixVar.d.b()).booleanValue()) {
            List list = ((zqw) obj2).a;
            if (list.size() == 1) {
                final ajlt ajltVar = (ajlt) fcva.X(list);
                wab wabVar = obj3 instanceof wab ? (wab) obj3 : null;
                if (wabVar == null || !wabVar.m()) {
                    ekrw ekrwVarH = vix.a.h();
                    ekrwVarH.X(eksq.a, "BugleRcsEdits");
                    ekrd ekrdVar = (ekrd) ekrwVarH;
                    ekrdVar.X(cqnc.c, ajltVar.b());
                    ((ekrd) ekrdVar.h("com/google/android/apps/messaging/conversation2/actions/editmessage/EditActionPlugin", "editActionUiData", 93, "EditActionPlugin.kt")).q("Not editable reason: conversation does not support edit");
                } else if (r3 != 0 && ajltVar.v(r3)) {
                    String string = vixVar.b.getString(R.string.edit_action);
                    string.getClass();
                    return new dihq(string, djrr.aV, false, false, false, false, null, false, null, new fdae() { // from class: vit
                        @Override // defpackage.fdae
                        public final Object invoke() {
                            ajlt ajltVar2 = ajltVar;
                            vix vixVar2 = vixVar;
                            auvw.k(vixVar2.c, null, null, new viw(ajltVar2, vixVar2, null), 3);
                            zup zupVar = vixVar2.f;
                            auvw.k(zupVar.b, null, null, new zuo(zupVar, null), 3);
                            vixVar2.g.a(41);
                            vixVar2.e.b();
                            return fctx.a;
                        }
                    }, 1012);
                }
            }
        }
        return null;
    }
}
