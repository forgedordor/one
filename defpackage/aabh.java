package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aabh extends eefa {
    final /* synthetic */ aabj a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aabh(aabj aabjVar, Context context, int i) {
        super(context, i);
        this.a = aabjVar;
    }

    @Override // defpackage.eefa, android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        fdae fdaeVar = this.a.m;
        if (fdaeVar != null) {
            fdaeVar.invoke();
            super.cancel();
        } else {
            ekrd ekrdVarA = aabj.b.a(Level.WARNING);
            ekrdVarA.X(eksq.a, "BugleReactions");
            ((ekrd) ekrdVarA.h("com/google/android/apps/messaging/conversation2/screen/bottomsheets/reactionpicker/fragment/ReactionPickerFragmentPeer$onCreateDialog$1", "cancel", 134, "ReactionPickerFragmentPeer.kt")).q("cancelled before `onCancel` was initialized");
        }
    }

    @Override // defpackage.kb, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        if (isShowing()) {
            aabj aabjVar = this.a;
            aabjVar.e.g(aabjVar.c.N(), false);
            fdae fdaeVar = aabjVar.n;
            if (fdaeVar != null) {
                fdaeVar.invoke();
                super.dismiss();
            } else {
                ekrd ekrdVarA = aabj.b.a(Level.WARNING);
                ekrdVarA.X(eksq.a, "BugleReactions");
                ((ekrd) ekrdVarA.h("com/google/android/apps/messaging/conversation2/screen/bottomsheets/reactionpicker/fragment/ReactionPickerFragmentPeer$onCreateDialog$1", "dismiss", 148, "ReactionPickerFragmentPeer.kt")).q("attempted dismiss before `onDismiss` was initialized");
            }
        }
    }

    @Override // defpackage.eefa, defpackage.abk, android.app.Dialog
    protected final void onStart() throws Resources.NotFoundException {
        super.onStart();
        final aabj aabjVar = this.a;
        setOnShowListener(new DialogInterface.OnShowListener() { // from class: aabf
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) throws Resources.NotFoundException {
                View viewFindViewById = this.a.findViewById(R.id.design_bottom_sheet);
                if (viewFindViewById != null) {
                    final aabj aabjVar2 = aabjVar;
                    BottomSheetBehavior.v(viewFindViewById).E(3);
                    if (((aqkn) aabjVar2.g.b()).a()) {
                        ldn ldnVar = new ldn() { // from class: aabg
                            @Override // defpackage.ldn
                            public final lgt ez(View view, lgt lgtVar) {
                                kzc kzcVarF = lgtVar.f(519);
                                int iA = aaaq.a(aabjVar2.h.c);
                                view.setPadding(0, kzcVarF.c, 0, (iA != 0 && iA == 4) ? 0 : kzcVarF.e);
                                return lgt.a;
                            }
                        };
                        int[] iArr = ley.a;
                        len.k(viewFindViewById, ldnVar);
                        lel.c(viewFindViewById);
                    }
                }
            }
        });
    }
}
