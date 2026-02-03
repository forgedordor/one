package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.media3.ui.AspectRatioFrameLayout;
import androidx.media3.ui.SubtitleView;
import com.google.android.apps.messaging.R;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ohi extends FrameLayout {
    public final ohh a;
    public final AspectRatioFrameLayout b;
    public final View c;
    public final View d;
    public final ImageView e;
    public final SubtitleView f;
    public final ogh g;
    public final Handler h;
    public final Class i;
    public final Method j;
    public final Object k;
    public mcg l;
    public boolean m;
    public boolean n;
    private final ImageView o;
    private final View p;
    private final TextView q;
    private int r;
    private int s;
    private boolean t;
    private boolean u;

    public ohi(Context context) throws NoSuchMethodException, ClassNotFoundException, SecurityException, IllegalArgumentException {
        Class<?> cls;
        Object objNewProxyInstance;
        Method method;
        super(context, null, 0);
        ohh ohhVar = new ohh(this);
        this.a = ohhVar;
        this.h = new Handler(Looper.getMainLooper());
        if (isInEditMode()) {
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
            this.o = null;
            this.f = null;
            this.p = null;
            this.q = null;
            this.g = null;
            this.i = null;
            this.j = null;
            this.k = null;
            ImageView imageView = new ImageView(context);
            Resources resources = getResources();
            imageView.setImageDrawable(mgb.C(context, resources, R.drawable.exo_edit_mode_logo));
            imageView.setBackgroundColor(resources.getColor(R.color.exo_edit_mode_background_color, null));
            addView(imageView);
            return;
        }
        LayoutInflater.from(context).inflate(R.layout.exo_player_view, this);
        setDescendantFocusability(262144);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(R.id.exo_content_frame);
        this.b = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.b(0);
        }
        this.c = findViewById(R.id.exo_shutter);
        if (aspectRatioFrameLayout != null) {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            SurfaceView surfaceView = new SurfaceView(context);
            if (Build.VERSION.SDK_INT >= 34) {
                surfaceView.setSurfaceLifecycle(2);
            }
            this.d = surfaceView;
            surfaceView.setLayoutParams(layoutParams);
            surfaceView.setOnClickListener(ohhVar);
            surfaceView.setClickable(false);
            aspectRatioFrameLayout.addView(surfaceView, 0);
        } else {
            this.d = null;
        }
        this.e = (ImageView) findViewById(R.id.exo_image);
        try {
            cls = Class.forName("androidx.media3.exoplayer.ExoPlayer");
            Class<?> cls2 = Class.forName("androidx.media3.exoplayer.image.ImageOutput");
            method = cls.getMethod("setImageOutput", cls2);
            objNewProxyInstance = Proxy.newProxyInstance(cls2.getClassLoader(), new Class[]{cls2}, new InvocationHandler() { // from class: ohf
                @Override // java.lang.reflect.InvocationHandler
                public final Object invoke(Object obj, Method method2, Object[] objArr) {
                    if (!method2.getName().equals("onImageAvailable")) {
                        return null;
                    }
                    final ohi ohiVar = this.a;
                    final Bitmap bitmap = (Bitmap) objArr[1];
                    ohiVar.h.post(new Runnable() { // from class: ohg
                        @Override // java.lang.Runnable
                        public final void run() {
                            ohi ohiVar2 = ohiVar;
                            BitmapDrawable bitmapDrawable = new BitmapDrawable(ohiVar2.getResources(), bitmap);
                            ImageView imageView2 = ohiVar2.e;
                            if (imageView2 != null) {
                                imageView2.setImageDrawable(bitmapDrawable);
                                ohiVar2.n();
                            }
                            if (ohiVar2.p()) {
                                return;
                            }
                            ohiVar2.f();
                            ohiVar2.a();
                        }
                    });
                    return null;
                }
            });
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            objNewProxyInstance = null;
            method = null;
        }
        this.i = cls;
        this.j = method;
        this.k = objNewProxyInstance;
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_artwork);
        this.o = imageView2;
        this.r = imageView2 != null ? 1 : 0;
        SubtitleView subtitleView = (SubtitleView) findViewById(R.id.exo_subtitles);
        this.f = subtitleView;
        if (subtitleView != null) {
            subtitleView.b();
            subtitleView.c();
        }
        View viewFindViewById = findViewById(R.id.exo_buffering);
        this.p = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(8);
        }
        TextView textView = (TextView) findViewById(R.id.exo_error_message);
        this.q = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        ogh oghVar = (ogh) findViewById(R.id.exo_controller);
        View viewFindViewById2 = findViewById(R.id.exo_controller_placeholder);
        if (oghVar != null) {
            this.g = oghVar;
        } else if (viewFindViewById2 != null) {
            ogh oghVar2 = new ogh(context);
            this.g = oghVar2;
            oghVar2.setId(R.id.exo_controller);
            oghVar2.setLayoutParams(viewFindViewById2.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById2.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById2);
            viewGroup.removeView(viewFindViewById2);
            viewGroup.addView(oghVar2, iIndexOfChild);
        } else {
            this.g = null;
        }
        ogh oghVar3 = this.g;
        this.s = oghVar3 != null ? 5000 : 0;
        this.u = true;
        this.t = true;
        this.n = true;
        this.m = oghVar3 != null;
        if (oghVar3 != null) {
            ohe oheVar = oghVar3.a;
            int i = oheVar.s;
            if (i != 3 && i != 2) {
                oheVar.h();
                oheVar.e();
            }
            ogh oghVar4 = this.g;
            ohh ohhVar2 = this.a;
            mee.f(ohhVar2);
            oghVar4.e.add(ohhVar2);
        }
        setClickable(true);
        j();
    }

    protected static final void s(AspectRatioFrameLayout aspectRatioFrameLayout, float f) {
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.a(f);
        }
    }

    private final void t() {
        ImageView imageView = this.o;
        if (imageView != null) {
            imageView.setImageResource(android.R.color.transparent);
            imageView.setVisibility(4);
        }
    }

    private final boolean u(Drawable drawable) {
        ImageView imageView = this.o;
        if (imageView != null && drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
                s(this.b, intrinsicWidth / intrinsicHeight);
                imageView.setScaleType(scaleType);
                imageView.setImageDrawable(drawable);
                imageView.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    public final void a() {
        View view = this.c;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    public final void b() {
        d();
        ImageView imageView = this.e;
        if (imageView != null) {
            imageView.setImageResource(android.R.color.transparent);
        }
    }

    public final void c() {
        ogh oghVar = this.g;
        if (oghVar != null) {
            oghVar.b();
        }
    }

    public final void d() {
        ImageView imageView = this.e;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        mcg mcgVar = this.l;
        if (mcgVar != null && mcgVar.m(16) && this.l.Y()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        int keyCode = keyEvent.getKeyCode();
        boolean z = keyCode == 19 || keyCode == 270 || keyCode == 22 || keyCode == 271 || keyCode == 20 || keyCode == 269 || keyCode == 21 || keyCode == 268 || keyCode == 23;
        if (z && r() && !this.g.q()) {
            e(true);
            return true;
        }
        if ((r() && this.g.p(keyEvent)) || super.dispatchKeyEvent(keyEvent)) {
            e(true);
            return true;
        }
        if (!z || !r()) {
            return false;
        }
        e(true);
        return false;
    }

    public final void e(boolean z) {
        boolean z2;
        if (!(q() && this.n) && r()) {
            ogh oghVar = this.g;
            boolean z3 = true;
            boolean z4 = oghVar.q() && oghVar.J <= 0;
            mcg mcgVar = this.l;
            if (mcgVar == null) {
                z2 = true;
            } else {
                int iT = mcgVar.t();
                if (this.t && (!this.l.m(17) || !this.l.H().q())) {
                    if (iT != 1 && iT != 4) {
                        mcg mcgVar2 = this.l;
                        mee.f(mcgVar2);
                        if (!mcgVar2.W()) {
                        }
                    }
                    z2 = true;
                }
                z2 = false;
            }
            if (z || z4) {
                z3 = z2;
            } else if (!z2) {
                return;
            }
            if (r()) {
                oghVar.J = z3 ? 0 : this.s;
                if (oghVar.q()) {
                    oghVar.a.i();
                }
                ohe oheVar = oghVar.a;
                ogh oghVar2 = oheVar.a;
                if (!oghVar2.r()) {
                    oghVar2.setVisibility(0);
                    oghVar2.e();
                    ImageView imageView = oghVar2.n;
                    if (imageView != null) {
                        imageView.requestFocus();
                    }
                }
                oheVar.l();
            }
        }
    }

    public final void f() {
        ImageView imageView = this.e;
        if (imageView != null) {
            imageView.setVisibility(0);
            n();
        }
    }

    public final void g() {
        if (!r() || this.l == null) {
            return;
        }
        ogh oghVar = this.g;
        if (!oghVar.q()) {
            e(true);
        } else if (this.u) {
            oghVar.b();
        }
    }

    public final void h() {
        mcg mcgVar = this.l;
        mde mdeVarK = mcgVar != null ? mcgVar.K() : mde.a;
        int i = mdeVarK.b;
        int i2 = mdeVarK.c;
        float f = 0.0f;
        if (i2 != 0 && i != 0) {
            f = (i * mdeVarK.d) / i2;
        }
        s(this.b, f);
    }

    public final void i() {
        View view = this.p;
        if (view != null) {
            mcg mcgVar = this.l;
            if (mcgVar != null) {
                mcgVar.t();
            }
            view.setVisibility(8);
        }
    }

    public final void j() {
        ogh oghVar = this.g;
        if (oghVar == null || !this.m) {
            setContentDescription(null);
        } else if (oghVar.q()) {
            setContentDescription(this.u ? getResources().getString(R.string.exo_controls_hide) : null);
        } else {
            setContentDescription(getResources().getString(R.string.exo_controls_show));
        }
    }

    public final void k() {
        if (q() && this.n) {
            c();
        } else {
            e(false);
        }
    }

    public final void l() {
        TextView textView = this.q;
        if (textView != null) {
            mcg mcgVar = this.l;
            if (mcgVar != null) {
                ((mrn) mcgVar).ad();
            }
            textView.setVisibility(8);
        }
    }

    public final void m(boolean z) {
        byte[] bArr;
        ImageView imageView;
        Drawable drawable;
        mcg mcgVar = this.l;
        boolean z2 = (mcgVar == null || !mcgVar.m(30) || mcgVar.J().a()) ? false : true;
        if (!z2 || z) {
            t();
            a();
            b();
            if (!z2) {
                return;
            }
        }
        boolean zP = p();
        boolean zO = o();
        if (!zP && !zO) {
            a();
            b();
        }
        View view = this.c;
        boolean z3 = (view == null || view.getVisibility() != 4 || (imageView = this.e) == null || (drawable = imageView.getDrawable()) == null || drawable.getAlpha() == 0) ? false : true;
        if (zO && !zP && z3) {
            a();
            f();
        } else if (zP && !zO && z3) {
            b();
        }
        if (!zP && !zO && this.r != 0) {
            mee.g(this.o);
            if (mcgVar != null && mcgVar.m(18) && (bArr = mcgVar.E().g) != null) {
                if (u(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)))) {
                    return;
                }
            }
            if (u(null)) {
                return;
            }
        }
        t();
    }

    public final void n() {
        Drawable drawable;
        ImageView imageView = this.e;
        if (imageView == null || (drawable = imageView.getDrawable()) == null) {
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            return;
        }
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
        if (imageView.getVisibility() == 0) {
            s(this.b, intrinsicWidth / intrinsicHeight);
        }
        imageView.setScaleType(scaleType);
    }

    public final boolean o() {
        mcg mcgVar = this.l;
        return mcgVar != null && this.k != null && mcgVar.m(30) && mcgVar.J().b(4);
    }

    @Override // android.view.View
    public final boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!r() || this.l == null) {
            return false;
        }
        e(true);
        return true;
    }

    public final boolean p() {
        mcg mcgVar = this.l;
        return mcgVar != null && mcgVar.m(30) && mcgVar.J().b(2);
    }

    @Override // android.view.View
    public final boolean performClick() {
        g();
        return super.performClick();
    }

    public final boolean q() {
        mcg mcgVar = this.l;
        return mcgVar != null && mcgVar.m(16) && this.l.Y() && this.l.W();
    }

    public final boolean r() {
        if (!this.m) {
            return false;
        }
        mee.g(this.g);
        return true;
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        View view = this.d;
        if (view instanceof SurfaceView) {
            view.setVisibility(i);
        }
    }
}
