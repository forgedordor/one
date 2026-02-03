package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.support.v7.widget.AppCompatTextView;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BulletSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.TextAppearanceSpan;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxcf extends AppCompatTextView implements dxcd {
    public boolean a;
    public boolean b;
    public boolean c;
    final int d;
    int e;
    int f;
    public dwyf g;
    public boolean h;
    private float[] i;
    private final int j;
    private final int k;
    private int l;
    private int m;
    private int n;
    private final int o;
    private final int p;
    private final int q;
    private final int r;
    private final int s;
    private final int t;

    public dxcf(Context context) throws Resources.NotFoundException {
        super(dwyh.a(context, fbfm.i()), null, R.attr.bubbleCellTextContentStyle);
        this.a = false;
        this.b = false;
        this.c = false;
        this.h = false;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, dxca.a, R.attr.bubbleCellTextContentStyle, R.style.LighterBubbleCellTextMessage);
        this.i = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        setPadding(getResources().getDimensionPixelSize(R.dimen.bubble_cell_content_start_end_padding), getResources().getDimensionPixelSize(R.dimen.bubble_cell_content_top_bottom_padding), getResources().getDimensionPixelSize(R.dimen.bubble_cell_content_start_end_padding), getResources().getDimensionPixelSize(R.dimen.bubble_cell_content_top_bottom_padding));
        setMaxWidth(dwyo.a(getContext(), 300.0f));
        this.j = eejq.a(R.dimen.m3_sys_elevation_level3, getContext());
        this.k = typedArrayObtainStyledAttributes.getColor(2, eehg.b(this, R.attr.colorPrimary));
        this.s = eehg.b(this, R.attr.colorPrimary);
        this.t = eehg.b(this, R.attr.colorOnSurfaceVariant);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, R.style.IncomingBubbleCellTextMessage);
        this.o = resourceId;
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(3, R.style.OutgoingBubbleCellTextMessage);
        this.p = resourceId2;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, new int[]{android.R.attr.textColor});
        this.d = eehg.b(this, R.attr.colorOnSurface);
        this.q = dwyo.b(eehg.b(this, R.attr.colorPrimaryInverse), 128);
        typedArrayObtainStyledAttributes2.recycle();
        TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(resourceId2, new int[]{android.R.attr.textColor});
        if (fbfm.g()) {
            this.e = eehg.b(this, R.attr.colorOnMessageBubbleOutgoingRcs);
        } else {
            this.e = eehg.b(this, R.attr.colorOnPrimary);
        }
        this.r = dwyo.b(eehg.b(this, R.attr.colorOnSurface), 128);
        typedArrayObtainStyledAttributes3.recycle();
        typedArrayObtainStyledAttributes.recycle();
        int[] iArr = ley.a;
        setImportantForAccessibility(4);
    }

    static int e(int i) {
        float[] fArr = {f, 0.0f, 0.0f};
        kzb.j(i, fArr);
        float f = fArr[0] - 3.0f;
        return f < 0.0f ? i : kzb.c(fArr);
    }

    private final void f() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(this.l);
        int i = this.m;
        if (i != this.n) {
            if (fbfm.m() && fbfm.i() && dwyh.b(getResources().getConfiguration())) {
                int iC = this.n;
                float[] fArr = {0.0f, 0.0f, f};
                kzb.j(iC, fArr);
                float f = fArr[2] + 0.03f;
                if (f <= 1.0f) {
                    iC = kzb.c(fArr);
                }
                this.n = iC;
            } else {
                this.m = e(this.m);
                this.n = e(this.n);
            }
            gradientDrawable.setOrientation(GradientDrawable.Orientation.TL_BR);
            int[] iArr = {this.m, this.n};
            if (Build.VERSION.SDK_INT < 29) {
                gradientDrawable.setColors(iArr);
            } else if (fbfm.m() && fbfm.i() && dwyh.b(getResources().getConfiguration())) {
                gradientDrawable.setColors(iArr, new float[]{0.4f, 0.9f});
            } else {
                gradientDrawable.setColors(iArr, new float[]{0.2f, 0.8f});
            }
        } else {
            gradientDrawable.setColor(i);
        }
        gradientDrawable.setCornerRadii(this.i);
        setBackground(gradientDrawable);
    }

    @Override // defpackage.dwye
    public final /* synthetic */ void a(Object obj) {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v0, types: [android.view.View, android.widget.TextView, dxcf] */
    /* JADX WARN: Type inference failed for: r2v23, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v19, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v6, types: [android.text.SpannableString, java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r6v26, types: [lah] */
    /* JADX WARN: Type inference failed for: r7v9, types: [android.text.SpannableString] */
    /* JADX WARN: Type inference failed for: r9v0, types: [android.text.SpannableStringBuilder, java.lang.CharSequence] */
    @Override // defpackage.dxcd
    public final void b(dwqw dwqwVar) throws IllegalAccessException, NoSuchFieldException, Resources.NotFoundException, IllegalArgumentException {
        int i;
        ?? spannableString;
        int i2;
        int i3 = 1;
        if (dwqwVar.s() == 1) {
            setTextAppearance(this.o);
            i = this.d;
            int i4 = this.j;
            this.l = i4;
            this.m = i4;
            this.n = i4;
            this.f = this.s;
            setHighlightColor(this.q);
        } else {
            setTextAppearance(this.p);
            i = this.e;
            setHighlightColor(this.r);
            this.l = this.k;
            if (!fbfm.g()) {
                this.e = eehg.b(this, R.attr.colorOnMessageBubbleOutgoingRcs);
            }
            setTextColor(this.e);
            setLinkTextColor(this.e);
            this.m = eehg.b(this, R.attr.colorMessageBubbleOutgoingRcsGradientStart);
            this.n = eehg.b(this, R.attr.colorMessageBubbleOutgoingRcsGradientEnd);
            this.f = this.t;
        }
        f();
        if (this.c) {
            setTextIsSelectable(true);
            dwyn.a(this, this.f);
        }
        ?? r3 = 0;
        setLinksClickable(false);
        if (this.b) {
            setMovementMethod(new dxch(new dxce(this)));
        } else {
            setMovementMethod(new dxcg());
        }
        int iA = dwqwVar.h().a() - 1;
        if (iA != 1) {
            int i5 = 3;
            if (iA == 3 && this.a) {
                Context context = getContext();
                dwsa dwsaVarC = dwqwVar.h().c();
                ejwi ejwiVarJ = ejwi.j(Integer.valueOf(i));
                ?? spannableStringBuilder = new SpannableStringBuilder();
                ekgb ekgbVarA = dwsaVarC.a();
                int i6 = ((ekoe) ekgbVarA).c;
                int i7 = 0;
                while (i7 < i6) {
                    dwrl dwrlVar = (dwrl) ekgbVarA.get(i7);
                    if (spannableStringBuilder.length() > 0 && !((Boolean) dwrlVar.d().e(Boolean.valueOf((boolean) r3))).booleanValue()) {
                        spannableStringBuilder.append("\n");
                    }
                    int length = dwrlVar.e().length();
                    if (dwrlVar.c().g()) {
                        String strE = dwrlVar.e();
                        int iOrdinal = ((dwru) dwrlVar.c().c()).ordinal();
                        ejwi ejwiVarJ2 = iOrdinal != i3 ? iOrdinal != 2 ? iOrdinal != i5 ? iOrdinal != 4 ? iOrdinal != 5 ? ejud.a : ejwi.j(Integer.valueOf(R.style.TextAppearance_GoogleMaterial3_LabelMedium)) : ejwi.j(Integer.valueOf(R.style.TextAppearance_GoogleMaterial3_BodySmall)) : ejwi.j(Integer.valueOf(R.style.TextAppearance_GoogleMaterial3_BodyMedium)) : ejwi.j(Integer.valueOf(R.style.TextAppearance_GoogleMaterial3_TitleLarge)) : ejwi.j(Integer.valueOf(R.style.TextAppearance_GoogleMaterial3_HeadlineLarge));
                        if (ejwiVarJ2.g()) {
                            ?? spannableString2 = new SpannableString(((Integer) ejwiVarJ2.c()).intValue() == 2132149999 ? strE.toUpperCase(lad.a(context.getResources().getConfiguration()).f(r3)) : strE);
                            spannableString2.setSpan(new TextAppearanceSpan(context, ((Integer) ejwiVarJ2.c()).intValue()), r3, strE.length(), 33);
                            spannableString = spannableString2;
                        } else {
                            spannableString = new SpannableString(strE);
                        }
                    } else {
                        spannableString = new SpannableString(dwrlVar.e());
                    }
                    spannableString.setSpan(new ForegroundColorSpan(((Integer) ((ejwt) ejwiVarJ).a).intValue()), r3, dwrlVar.e().length(), 33);
                    if (dwrlVar.b().g()) {
                        ekgb ekgbVarA2 = ((ekgb) dwrlVar.b().c()).a();
                        int size = ekgbVarA2.size();
                        int i8 = r3;
                        while (i8 < size) {
                            int iOrdinal2 = ((dwrq) ekgbVarA2.get(i8)).a().ordinal();
                            ejwi ejwiVarJ3 = iOrdinal2 != i3 ? iOrdinal2 != 2 ? ejud.a : ejwi.j(new BulletSpan((int) context.getResources().getDimension(R.dimen.bullet_span_gap_width))) : ejwi.j(new LeadingMarginSpan.Standard(dwyo.a(context, r15.b())));
                            if (ejwiVarJ3.g()) {
                                spannableString.setSpan(ejwiVarJ3.c(), 0, length, 33);
                            }
                            i8++;
                            i3 = 1;
                        }
                    }
                    if (dwrlVar.a().g()) {
                        Object objC = dwrlVar.a().c();
                        int i9 = ((ekoe) objC).c;
                        int i10 = 0;
                        ?? r2 = objC;
                        while (i10 < i9) {
                            dwrn dwrnVar = (dwrn) r2.get(i10);
                            ArrayList arrayList = new ArrayList();
                            ekgb ekgbVarC = dwrnVar.c();
                            int i11 = ((ekoe) ekgbVarC).c;
                            ejwi ejwiVar = ejwiVarJ;
                            int i12 = 0;
                            Object obj = r2;
                            while (i12 < i11) {
                                int i13 = i12;
                                dwrv dwrvVar = (dwrv) ekgbVarC.get(i12);
                                Object obj2 = obj;
                                int i14 = i9;
                                if (dwrx.BOLD.equals(dwrvVar.b()) || dwrx.ITALIC.equals(dwrvVar.b())) {
                                    arrayList.add(dwrvVar);
                                } else {
                                    dwym.c(spannableString, dwrnVar, length, dwym.b(context, dwrvVar));
                                }
                                i12 = i13 + 1;
                                obj = obj2;
                                i9 = i14;
                            }
                            Object obj3 = obj;
                            int i15 = i9;
                            int size2 = arrayList.size();
                            int i16 = 0;
                            while (true) {
                                i2 = i10 + 1;
                                if (i16 < size2) {
                                    dwym.c(spannableString, dwrnVar, length, dwym.b(context, (dwrv) arrayList.get(i16)));
                                    i16++;
                                }
                            }
                            ejwiVarJ = ejwiVar;
                            i10 = i2;
                            r2 = obj3;
                            i9 = i15;
                        }
                    }
                    spannableStringBuilder.append(spannableString);
                    i7++;
                    ejwiVarJ = ejwiVarJ;
                    i3 = 1;
                    r3 = 0;
                    i5 = 3;
                }
                boolean z = ((URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class)).length > 0;
                this.h = z;
                if (z) {
                    dxba dxbaVar = (dxba) this.g;
                    dxbaVar.b.b(dxbaVar.b(124).a());
                } else {
                    setAutoLinkMask(15);
                }
                setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
            } else {
                setAutoLinkMask(15);
                setText((CharSequence) dwqwVar.k().e(""));
            }
        } else {
            setAutoLinkMask(15);
            setText(dwqwVar.h().d());
        }
        CharSequence text = getText();
        URLSpan[] uRLSpanArr = (URLSpan[]) new SpannableStringBuilder(text).getSpans(0, text.length(), URLSpan.class);
        HashSet<String> hashSet = new HashSet();
        for (URLSpan uRLSpan : uRLSpanArr) {
            hashSet.add(Uri.parse(uRLSpan.getURL()).getScheme());
        }
        for (String str : hashSet) {
            dwyf dwyfVar = this.g;
            Integer num = (Integer) dxba.a.get(str);
            dxba dxbaVar2 = (dxba) dwyfVar;
            dwhr dwhrVar = dxbaVar2.b;
            dwhp dwhpVarB = dxbaVar2.b(124);
            dwhpVarB.k(num != null ? num.intValue() : 0);
            dwhrVar.b(dwhpVarB.a());
        }
    }

    @Override // defpackage.dxcd
    public final void d(float f, float f2, float f3, float f4) {
        boolean zA = dvho.a(getContext());
        float f5 = true != zA ? f : f2;
        if (true != zA) {
            f = f2;
        }
        float f6 = true != zA ? f4 : f3;
        if (true == zA) {
            f3 = f4;
        }
        this.i = new float[]{dwyo.a(getContext(), f5), dwyo.a(getContext(), f5), dwyo.a(getContext(), f), dwyo.a(getContext(), f), dwyo.a(getContext(), f3), dwyo.a(getContext(), f3), dwyo.a(getContext(), f6), dwyo.a(getContext(), f6)};
        f();
    }

    @Override // android.support.v7.widget.AppCompatTextView, android.widget.TextView, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Layout layout = getLayout();
        int lineCount = layout.getLineCount();
        float f = 0.0f;
        for (int i3 = 0; i3 < lineCount; i3++) {
            float lineMax = layout.getLineMax(i3);
            if (lineMax > f) {
                f = lineMax;
            }
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(((int) Math.ceil(f)) + getPaddingLeft() + getPaddingRight(), Integer.MIN_VALUE), i2);
    }

    @Override // defpackage.dwyw
    public final void c() {
    }
}
