package defpackage;

import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.apps.messaging.R;
import java.util.Objects;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gnd extends abk {
    public fdae a;
    public final gmw c;
    private got d;
    private long e;
    private final View f;
    private final float g;

    public gnd(fdae fdaeVar, got gotVar, long j, View view, kji kjiVar, kio kioVar, UUID uuid, ddp ddpVar, fdjx fdjxVar) {
        super(new ContextThemeWrapper(view.getContext(), R.style.EdgeToEdgeFloatingDialogWindowTheme));
        this.a = fdaeVar;
        this.d = gotVar;
        this.e = j;
        this.f = view;
        this.g = 8.0f;
        Window window = getWindow();
        if (window == null) {
            throw new IllegalStateException("Dialog has no window");
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        lfq.a(window, false);
        gmw gmwVar = new gmw(getContext(), window);
        Objects.toString(uuid);
        gmwVar.setTag(R.id.compose_view_saveable_id_tag, "Dialog:".concat(String.valueOf(uuid)));
        gmwVar.setClipChildren(false);
        gmwVar.setElevation(kioVar.en(8.0f));
        gmwVar.setOutlineProvider(new gmy());
        this.c = gmwVar;
        setContentView(gmwVar);
        lxr.b(gmwVar, lxr.a(view));
        lxs.b(gmwVar, lxs.a(view));
        pje.b(gmwVar, pje.a(view));
        a(this.a, this.d, this.e, kjiVar);
        lhb lhbVar = new lhb(window, window.getDecorView());
        Boolean bool = this.d.a;
        lhbVar.b(bool != null ? bool.booleanValue() : gpb.b(this.e));
        Boolean bool2 = this.d.b;
        lhbVar.a(bool2 != null ? bool2.booleanValue() : gpb.b(this.e));
        this.b.b(this, new gnc(fdjxVar, ddpVar, new fdae() { // from class: gmx
            @Override // defpackage.fdae
            public final Object invoke() {
                this.a.a.invoke();
                return fctx.a;
            }
        }));
    }

    public final void a(fdae fdaeVar, got gotVar, long j, kji kjiVar) {
        this.a = fdaeVar;
        this.d = gotVar;
        this.e = j;
        ViewGroup.LayoutParams layoutParams = this.f.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        int i = 0;
        boolean z = (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
        int i2 = gotVar.c;
        Window window = getWindow();
        window.getClass();
        window.setFlags(true != z ? -8193 : 8192, 8192);
        gmw gmwVar = this.c;
        int iOrdinal = kjiVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                throw new fctg();
            }
            i = 1;
        }
        gmwVar.setLayoutDirection(i);
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setLayout(-1, -1);
        }
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setSoftInputMode(Build.VERSION.SDK_INT >= 30 ? 48 : 16);
        }
    }

    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (zOnTouchEvent) {
            this.a.invoke();
        }
        return zOnTouchEvent;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}
