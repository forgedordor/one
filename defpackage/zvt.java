package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zvt {
    private final Context a;
    private final zvz b;
    private final zvl c;
    private final zvn d;
    private final zvo e;
    private final Map f;
    private final fcsu g;
    private final fcsu h;
    private final fcsu i;

    public zvt(Context context, zvz zvzVar, zvl zvlVar, zvn zvnVar, zvo zvoVar, Map map, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        context.getClass();
        zvzVar.getClass();
        zvnVar.getClass();
        zvoVar.getClass();
        fcsuVar.getClass();
        fcsuVar3.getClass();
        this.a = context;
        this.b = zvzVar;
        this.c = zvlVar;
        this.d = zvnVar;
        this.e = zvoVar;
        this.f = map;
        this.g = fcsuVar;
        this.h = fcsuVar2;
        this.i = fcsuVar3;
    }

    private final String e(String str, boolean z) {
        String string = this.a.getString(true != z ? R.string.reaction_selection_content_description : R.string.selected_reaction_selection_content_description, str);
        string.getClass();
        return string;
    }

    public final List a(ekgb ekgbVar, final ckmn ckmnVar, final ajlt ajltVar, final anho anhoVar, Integer num, final fdae fdaeVar) {
        Object dkyaVar;
        ekgbVar.getClass();
        ckmnVar.getClass();
        ArrayList arrayList = new ArrayList(fcva.p(ekgbVar, 10));
        int i = 0;
        for (Object obj : ekgbVar) {
            int i2 = i + 1;
            if (i < 0) {
                fcva.m();
            }
            final anhj anhjVar = (anhj) obj;
            boolean z = num != null && num.intValue() == i;
            fdae fdaeVar2 = new fdae() { // from class: zvp
                @Override // defpackage.fdae
                public final Object invoke() {
                    anhj anhjVar2 = anhjVar;
                    anhjVar2.getClass();
                    this.a.c(anhjVar2, ajltVar, anhoVar, ckmnVar, fdaeVar);
                    return fctx.a;
                }
            };
            if (anhjVar instanceof angl) {
                Object obj2 = this.f.get(((angl) anhjVar).a);
                obj2.getClass();
                yyb yybVar = (yyb) obj2;
                qrz qrzVar = yybVar.a;
                String string = this.a.getString(yybVar.b);
                string.getClass();
                dkyaVar = new dkxy(qrzVar, e(string, z), fdaeVar2);
            } else {
                if (!(anhjVar instanceof angp)) {
                    throw new fctg();
                }
                angp angpVar = (angp) anhjVar;
                dkyaVar = new dkya(angpVar.b(), e(angpVar.b(), z), fdaeVar2);
            }
            arrayList.add(dkyaVar);
            i = i2;
        }
        return arrayList;
    }

    public final fdpl b(ajlt ajltVar) {
        return this.b.a(ajltVar, ckmx.a());
    }

    public final void c(anhj anhjVar, ajlt ajltVar, anho anhoVar, ckmn ckmnVar, fdae fdaeVar) {
        anhj anhjVar2 = anhoVar != null ? anhoVar.a : null;
        ckmc ckmcVar = anhjVar2 == null ? ckmc.ADD_REACTION : fdbq.f(anhjVar2, anhjVar) ? ckmc.REMOVE_REACTION : ckmc.REPLACE_REACTION;
        if (ckmcVar != ckmc.REMOVE_REACTION && yji.b(ajltVar) && ((Boolean) ((cczi) crbf.ak.get()).e()).booleanValue()) {
            boolean zF = fdbq.f(anhjVar, zuq.c);
            boolean zF2 = fdbq.f(anhjVar, zuq.d);
            if (zF2 && ((Boolean) crbf.ao.e()).booleanValue()) {
                ((afzc) this.h.b()).h(new agbb(null));
            } else if (zF) {
                ((dain) this.g.b()).c(R.string.feedback_confirmation, true);
            } else if (zF2) {
                zF2 = true;
                ((dain) this.g.b()).c(R.string.feedback_confirmation, true);
            }
            fcsu fcsuVar = this.i;
            if (((Optional) fcsuVar.b()).isPresent()) {
                agxn agxnVar = (agxn) ((Optional) fcsuVar.b()).get();
                if (zF) {
                    agxnVar.e();
                } else if (zF2) {
                    agxnVar.d();
                }
            }
        }
        this.e.d(ckmcVar, ckmnVar, ajltVar.q());
        this.d.a(anhjVar, ajltVar.b(), ckmnVar, ckmcVar, anhoVar != null ? anhoVar.b : null);
        fdaeVar.invoke();
    }

    public final void d(final ajlt ajltVar, final anho anhoVar, int i, final fdae fdaeVar) {
        zvl.a(this.c, ajltVar.q(), anhoVar != null ? anhoVar.a : null, i, null, new fdap() { // from class: zvq
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                anhj anhjVar = (anhj) obj;
                anhjVar.getClass();
                this.a.c(anhjVar, ajltVar, anhoVar, ckmn.CUSTOM_REACTION_PICKER, fdaeVar);
                return fctx.a;
            }
        }, null, 40);
    }
}
