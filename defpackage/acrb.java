package defpackage;

import android.content.res.Resources;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.material.snackbar.Snackbar;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
class acrb implements egps<evwl<adck>, List<String>> {
    final /* synthetic */ acrt a;

    public acrb(acrt acrtVar) {
        this.a = acrtVar;
    }

    @Override // defpackage.egps
    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) throws Resources.NotFoundException {
        final List list = (List) obj2;
        final adck adckVar = (adck) ((evwl) obj).a(adck.a, evrr.a());
        final boolean z = adckVar.c;
        final Runnable runnable = new Runnable() { // from class: acqz
            @Override // java.lang.Runnable
            public final void run() {
                ekgb ekgbVarE = barn.e(list);
                bvdk bvdkVar = z ? bvdk.UNARCHIVED : bvdk.ARCHIVED;
                elka elkaVarB = elka.b(adckVar.d);
                if (elkaVarB == null) {
                    elkaVarB = elka.UNKNOWN_BUGLE_CONVERSATION_ORIGIN;
                }
                acrt acrtVar = this.a.a;
                cqnx.c(acrtVar.D.a(ekgbVarE, bvdkVar, elkaVarB, acrtVar.am), "Bugle", "HomeFragmentPeer: failed to undo changes to conversations archive status");
            }
        };
        int i = true != z ? R.plurals.unarchived_toast_message : R.plurals.archived_toast_message;
        int size = list.size();
        acrt acrtVar = this.a;
        acom acomVar = acrtVar.b;
        String quantityString = acomVar.B().getQuantityString(i, size, Integer.valueOf(size));
        Snackbar snackbarQ = Snackbar.q(acrt.f(acomVar), quantityString, 0);
        snackbarQ.s(acomVar.A().getResources().getString(R.string.snack_bar_undo), new View.OnClickListener() { // from class: acra
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                runnable.run();
            }
        });
        snackbarQ.m(acrtVar.ad.g());
        snackbarQ.i();
        ((acns) acrtVar.aE.b()).a(quantityString);
        elka elkaVarB = elka.b(adckVar.d);
        if (elkaVarB == null) {
            elkaVarB = elka.UNKNOWN_BUGLE_CONVERSATION_ORIGIN;
        }
        if (elkaVarB != elka.CONVERSATION_FROM_LIST_SWIPE) {
            acrtVar.o();
        }
    }

    @Override // defpackage.egps
    public final /* bridge */ /* synthetic */ void f(Object obj, Throwable th) {
        ekrw ekrwVarJ = acrt.a.j();
        ekrwVarJ.X(eksq.a, "HomeFragmentFlogger");
        ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(th)).h("com/google/android/apps/messaging/home/HomeFragmentPeer$21", "onFailure", (char) 3827, "HomeFragmentPeer.java")).q("Failed to change the archive status of conversations");
    }

    @Override // defpackage.egps
    public final /* synthetic */ void b(Object obj) {
    }
}
