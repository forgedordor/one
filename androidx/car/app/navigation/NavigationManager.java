package androidx.car.app.navigation;

import androidx.car.app.IOnDoneCallback;
import androidx.car.app.navigation.INavigationManager;
import androidx.car.app.utils.RemoteUtils;
import defpackage.cmo;
import defpackage.cqf;
import defpackage.crq;
import defpackage.csb;
import defpackage.lvc;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class NavigationManager implements cmo {
    public final INavigationManager.Stub a;

    /* compiled from: PG */
    /* renamed from: androidx.car.app.navigation.NavigationManager$1, reason: invalid class name */
    public class AnonymousClass1 extends INavigationManager.Stub {
        final /* synthetic */ lvc val$lifecycle;

        public AnonymousClass1(lvc lvcVar) {
            this.val$lifecycle = lvcVar;
        }

        /* renamed from: lambda$onStopNavigation$0$androidx-car-app-navigation-NavigationManager$1, reason: not valid java name */
        public /* synthetic */ Object m234xb1216230() {
            csb.a();
            return null;
        }

        @Override // androidx.car.app.navigation.INavigationManager
        public void onStopNavigation(IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.d(this.val$lifecycle, iOnDoneCallback, "onStopNavigation", new crq() { // from class: cqe
                @Override // defpackage.crq
                public final Object a() {
                    return this.a.m234xb1216230();
                }
            });
        }
    }

    public NavigationManager(lvc lvcVar) {
        this.a = new AnonymousClass1(lvcVar);
        lvcVar.c(new cqf(lvcVar));
    }
}
