package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewStub;
import com.google.android.apps.messaging.R;
import com.google.android.material.appbar.AppBarLayout;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class acqs extends wg {
    final /* synthetic */ acrt a;

    public acqs(acrt acrtVar) {
        this.a = acrtVar;
    }

    @Override // defpackage.wg
    public final void a(RecyclerView recyclerView, int i, int i2) {
        acrt acrtVar = this.a;
        eieh eiehVarC = acrtVar.G.c("HomeFragmentPeer#onScrolled", "com/google/android/apps/messaging/home/HomeFragmentPeer$16", "onScrolled", 1973);
        try {
            if (acrtVar.aZ) {
                if (acrtVar.D()) {
                    eieu eieuVarK = eiiy.k("HomeFragment#onScrollToNewest");
                    try {
                        acrtVar.w();
                        eieuVarK.close();
                    } finally {
                    }
                } else {
                    ((badi) this.a.aW.a()).d(false);
                }
                ((Optional) this.a.T.b()).ifPresent(new Consumer() { // from class: acqr
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) {
                        acvb acvbVar = (acvb) obj;
                        final acrt acrtVar2 = this.a.a;
                        int iL = acrtVar2.aQ.L();
                        if (iL == 0 || iL == -1) {
                            acom acomVar = acrtVar2.b;
                            if (acrt.d(acomVar) != null) {
                                acrt.d(acomVar).setVisibility(8);
                                return;
                            }
                            return;
                        }
                        acom acomVar2 = acrtVar2.b;
                        if (acrt.d(acomVar2) == null) {
                            ViewStub viewStub = (ViewStub) acrt.f(acomVar2).findViewById(R.id.go_to_top_stub);
                            viewStub.setLayoutResource(true != ((eoth) ((arez) acvbVar.a).a.b()).a("bugle.enable_go_to_top_button_v2") ? R.layout.go_to_top_view : R.layout.go_to_top_view_v2);
                            viewStub.inflate().setOnClickListener(new View.OnClickListener() { // from class: acpk
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    acrt acrtVar3 = acrtVar2;
                                    acrt.b(acrtVar3.b).at(0);
                                    AppBarLayout appBarLayout = acrtVar3.bD.c;
                                    if (appBarLayout == null || acrtVar3.A()) {
                                        return;
                                    }
                                    appBarLayout.m(true);
                                }
                            });
                            acrt.e(acomVar2).requestApplyInsets();
                        }
                        acrt.d(acomVar2).setVisibility(0);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
            eiehVarC.close();
        } catch (Throwable th) {
            try {
                eiehVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.wg
    public final void b(RecyclerView recyclerView, int i) {
    }
}
