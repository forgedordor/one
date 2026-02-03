package defpackage;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class inu extends View {
    public static final /* synthetic */ int h = 0;
    private static final ViewOutlineProvider i = new ins();
    public boolean a;
    public Outline b;
    public boolean c;
    public kio d;
    public kji e;
    public fdap f;
    public ini g;
    private final ijc j;
    private final imu k;

    public inu(View view, ijc ijcVar, imu imuVar) {
        super(view.getContext());
        this.j = ijcVar;
        this.k = imuVar;
        setOutlineProvider(i);
        this.c = true;
        this.d = imx.a;
        this.e = kji.a;
        this.f = ink.a;
        setWillNotDraw(false);
        setClipBounds(null);
    }

    @Override // android.view.View
    protected final void dispatchDraw(Canvas canvas) {
        ijc ijcVar = this.j;
        iic iicVar = ijcVar.a;
        Canvas canvas2 = iicVar.a;
        iicVar.a = canvas;
        kio kioVar = this.d;
        kji kjiVar = this.e;
        float width = getWidth();
        float height = getHeight();
        long jFloatToRawIntBits = Float.floatToRawIntBits(width);
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(height);
        imu imuVar = this.k;
        imt imtVar = imuVar.b;
        ini iniVar = this.g;
        fdap fdapVar = this.f;
        kio kioVarC = imtVar.c();
        kji kjiVarD = imtVar.d();
        ijb ijbVarB = imtVar.b();
        long jA = imtVar.a();
        ini iniVar2 = imtVar.a;
        imtVar.f(kioVar);
        imtVar.g(kjiVar);
        imtVar.e(iicVar);
        imtVar.h((jFloatToRawIntBits << 32) | (jFloatToRawIntBits2 & 4294967295L));
        imtVar.a = iniVar;
        iicVar.l();
        try {
            fdapVar.invoke(imuVar);
            iicVar.j();
            imt imtVar2 = imuVar.b;
            imtVar2.f(kioVarC);
            imtVar2.g(kjiVarD);
            imtVar2.e(ijbVarB);
            imtVar2.h(jA);
            imtVar2.a = iniVar2;
            ijcVar.a.a = canvas2;
            this.a = false;
        } catch (Throwable th) {
            iicVar.j();
            imt imtVar3 = imuVar.b;
            imtVar3.f(kioVarC);
            imtVar3.g(kjiVarD);
            imtVar3.e(ijbVarB);
            imtVar3.h(jA);
            imtVar3.a = iniVar2;
            throw th;
        }
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.c;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.a) {
            return;
        }
        this.a = true;
        super.invalidate();
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
    }
}
