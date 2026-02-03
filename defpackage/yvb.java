package defpackage;

import com.google.android.apps.messaging.R;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yvb implements fdae {
    final /* synthetic */ auyl[] a;
    final /* synthetic */ ajlt b;
    final /* synthetic */ djtq c;
    final /* synthetic */ yvq d;
    final /* synthetic */ ytz e;

    public yvb(auyl[] auylVarArr, ajlt ajltVar, djtq djtqVar, yvq yvqVar, ytz ytzVar) {
        this.a = auylVarArr;
        this.b = ajltVar;
        this.c = djtqVar;
        this.d = yvqVar;
        this.e = ytzVar;
    }

    @Override // defpackage.fdae
    public final djtg invoke() {
        dlhy dlhyVarL;
        ArrayList arrayList = new ArrayList(3);
        int i = 0;
        while (true) {
            dlhyVarL = null;
            Object objB = null;
            if (i >= 3) {
                break;
            }
            auyl auylVar = this.a[i];
            if (auylVar != null) {
                objB = auylVar.b();
            }
            arrayList.add(objB);
            i++;
        }
        Object[] array = arrayList.toArray(new Object[0]);
        Object obj = array[0];
        Object obj2 = array[1];
        boolean zBooleanValue = ((Boolean) array[2]).booleanValue();
        dlhy dlhyVar = (dlhy) obj2;
        dknh dknhVarC = (dknh) obj;
        ekrw ekrwVarE = yvq.a.e();
        ekrwVarE.X(eksq.a, "BugleImage");
        ekrd ekrdVar = (ekrd) ekrwVarE.h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/image/ImageBubbleUiAdapter$getDisplayableUiData$$inlined$combineInitialValuedFlow$1", "invoke", 419, "ImageBubbleUiAdapter.kt");
        ajlt ajltVar = this.b;
        String strA = ajltVar.b().a();
        djtq djtqVar = this.c;
        ekrdVar.D("Image bubble with messageId = %s is in %s state", strA, djtqVar.f);
        yvq yvqVar = this.d;
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
        return yvqVar.a(djtq.r(djtqVar, dknhVar, null, null, null, zBooleanValue, dlhyVarL, null, null, 245487), this.e);
    }
}
