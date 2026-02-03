package defpackage;

import com.google.android.apps.messaging.R;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yvd extends fcyz implements fdau {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ auyl[] c;
    final /* synthetic */ ajlt d;
    final /* synthetic */ djtq e;
    final /* synthetic */ yvq f;
    final /* synthetic */ ytz g;
    private /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yvd(fcxy fcxyVar, auyl[] auylVarArr, ajlt ajltVar, djtq djtqVar, yvq yvqVar, ytz ytzVar) {
        super(3, fcxyVar);
        this.c = auylVarArr;
        this.d = ajltVar;
        this.e = djtqVar;
        this.f = yvqVar;
        this.g = ytzVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        yvd yvdVar = new yvd((fcxy) obj3, this.c, this.d, this.e, this.f, this.g);
        yvdVar.h = (fdpm) obj;
        yvdVar.b = (Object[]) obj2;
        return yvdVar.b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v1, types: [fdpm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v7 */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        dlhy dlhyVarL;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ?? r2 = this.h;
            Object obj2 = this.b;
            auyl[] auylVarArr = this.c;
            ArrayList arrayList = new ArrayList(3);
            int i2 = 0;
            int i3 = 0;
            while (true) {
                dlhyVarL = null;
                if (i2 >= 3) {
                    break;
                }
                if (auylVarArr[i2] != null) {
                    dlhyVarL = ((Object[]) obj2)[i3];
                    i3++;
                }
                arrayList.add(dlhyVarL);
                i2++;
            }
            Object[] array = arrayList.toArray(new Object[0]);
            Object obj3 = array[0];
            Object obj4 = array[1];
            boolean zBooleanValue = ((Boolean) array[2]).booleanValue();
            dlhy dlhyVar = (dlhy) obj4;
            dknh dknhVarC = (dknh) obj3;
            ekrw ekrwVarE = yvq.a.e();
            ekrwVarE.X(eksq.a, "BugleImage");
            ekrd ekrdVar = (ekrd) ekrwVarE.h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/image/ImageBubbleUiAdapter$getDisplayableUiData$$inlined$combineInitialValuedFlow$2$3", "invokeSuspend", 419, "ImageBubbleUiAdapter.kt");
            ajlt ajltVar = this.d;
            String strA = ajltVar.b().a();
            djtq djtqVar = this.e;
            ekrdVar.D("Image bubble with messageId = %s is in %s state", strA, djtqVar.f);
            yvq yvqVar = this.f;
            if (zBooleanValue) {
                dknhVarC = ((yya) yvqVar.h.b()).c(new yxg(ajltVar), yvqVar.c.getString(R.string.message_bubble_save_to_device), new yvf(yvqVar, ajltVar));
            }
            dknh dknhVar = dknhVarC;
            if (dlhyVar != null) {
                if (dlhyVar instanceof dlhm) {
                    dlhyVarL = dlhm.l((dlhm) dlhyVar, null, null, null, null, null, true, true, 3080191);
                } else {
                    if (!(dlhyVar instanceof djpa)) {
                        throw new IllegalStateException("Caption flow emits a value with unsupported type");
                    }
                    dlhyVarL = djpa.l((djpa) dlhyVar, null, true, true, 385023);
                }
            }
            djtg djtgVarA = yvqVar.a(djtq.r(djtqVar, dknhVar, null, null, null, zBooleanValue, dlhyVarL, null, null, 245487), this.g);
            this.a = 1;
            if (r2.fO(djtgVarA, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }
}
