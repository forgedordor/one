package defpackage;

import android.widget.ImageView;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwml {
    public final TextView a;
    public final TextView b;
    public boolean c;
    public boolean d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    private final TextView n;

    @Deprecated
    private final ImageView o;
    private final ImageView p;
    private final ImageView q;

    public cwml(TextView textView, ImageView imageView, TextView textView2, ImageView imageView2, TextView textView3, ImageView imageView3) {
        this.n = textView;
        this.o = imageView;
        this.a = textView2;
        this.p = imageView2;
        this.b = textView3;
        this.q = imageView3;
    }

    private final int f(int i) {
        return ((this.c ? this.a.getMeasuredHeight() : this.h) - i) / 2;
    }

    private final void g(int i) {
        if (this.c) {
            if (this.d || this.f + i > this.e) {
                this.d = true;
                this.f = this.j;
                this.g += this.h;
            }
        }
    }

    public final void a() {
        ImageView imageView = this.o;
        if (imageView.getVisibility() == 8) {
            return;
        }
        int measuredWidth = imageView.getMeasuredWidth();
        int measuredHeight = imageView.getMeasuredHeight();
        int i = this.i - measuredHeight;
        if (this.c && this.p.getVisibility() == 8 && (this.d || this.f + measuredWidth > this.e)) {
            this.d = true;
            this.f = this.j;
            this.g += this.h;
        }
        int i2 = this.f;
        int i3 = this.g;
        imageView.layout(i2, i3 + i, i2 + measuredWidth, i3 + measuredHeight + i);
        this.f += measuredWidth;
    }

    public final void b() {
        ImageView imageView = this.p;
        if (imageView.getVisibility() == 8) {
            return;
        }
        int measuredWidth = imageView.getMeasuredWidth();
        int measuredHeight = imageView.getMeasuredHeight();
        g(measuredWidth);
        int iF = f(measuredHeight);
        int i = this.f;
        int i2 = this.g;
        imageView.layout(i, i2 + iF, i + measuredWidth, i2 + measuredHeight + iF);
        this.f += measuredWidth;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            r7 = this;
            android.widget.TextView r0 = r7.n
            int r1 = r0.getVisibility()
            r2 = 8
            if (r1 != r2) goto Lb
            goto L58
        Lb:
            int r1 = r0.getMeasuredWidth()
            int r2 = r0.getMeasuredHeight()
            boolean r3 = r7.d
            if (r3 != 0) goto L1f
            int r3 = r7.f
            int r4 = r3 + r1
            int r5 = r7.e
            if (r4 <= r5) goto L2d
        L1f:
            r3 = 1
            r7.d = r3
            int r3 = r7.j
            r7.f = r3
            int r4 = r7.g
            int r5 = r7.h
            int r4 = r4 + r5
            r7.g = r4
        L2d:
            int r4 = r7.g
            int r5 = r3 + r1
            int r6 = r4 + r2
            r0.layout(r3, r4, r5, r6)
            int r3 = r7.f
            int r3 = r3 + r1
            r7.f = r3
            boolean r1 = r7.c
            if (r1 == 0) goto L58
            int r1 = r7.j
            int r3 = r7.k
            int r4 = r7.m
            int r5 = r7.l
            r0.setPadding(r1, r3, r4, r5)
            int r1 = r7.h
            int r1 = java.lang.Math.max(r2, r1)
            r7.h = r1
            int r0 = r0.getBaseline()
            r7.i = r0
        L58:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cwml.c():void");
    }

    public final void d() {
        ImageView imageView = this.q;
        if (imageView.getVisibility() == 8) {
            return;
        }
        ImageView imageView2 = this.p;
        int measuredWidth = imageView.getMeasuredWidth();
        int measuredHeight = imageView.getMeasuredHeight();
        if (imageView2.getVisibility() == 8) {
            g(measuredWidth);
        }
        int iF = f(measuredHeight);
        int i = this.f;
        int i2 = this.g;
        imageView.layout(i, i2 + iF, i + measuredWidth, i2 + measuredHeight + iF);
        this.f += measuredWidth;
    }

    public final void e() {
        TextView textView = this.a;
        if (textView.getVisibility() == 8) {
            return;
        }
        ImageView imageView = this.q;
        int measuredWidth = textView.getMeasuredWidth();
        int measuredHeight = textView.getMeasuredHeight();
        if (imageView.getVisibility() == 8 && ((this.c && this.o.getVisibility() == 8 && this.p.getVisibility() == 8 && (this.d || this.f + measuredWidth > this.e)) || (!this.c && (this.d || this.f + measuredWidth > this.e)))) {
            this.d = true;
            this.f = this.j;
            this.g += this.h;
        }
        int i = this.f;
        int i2 = this.g;
        textView.layout(i, i2, i + measuredWidth, i2 + measuredHeight);
        this.f += measuredWidth;
        if (this.c) {
            return;
        }
        this.h = measuredHeight;
        this.i = textView.getBaseline();
    }
}
