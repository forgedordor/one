package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwhm extends LinearLayout implements dxcd {
    private final TextView a;
    private final TextView b;
    private final TextView c;
    private final TextView d;
    private final ImageView e;
    private final float[] f;
    private final float[] g;
    private final int h;
    private final int i;
    private int j;
    private final int k;
    private final int l;
    private final int m;
    private final int n;
    private final int o;
    private final int p;

    public dwhm(Context context) {
        super(dwyh.a(context, fbfm.i()), null, R.attr.linkPreviewBubbleCellTextContentStyle);
        this.f = new float[]{getResources().getDimension(R.dimen.bubble_cell_radius), getResources().getDimension(R.dimen.bubble_cell_radius), getResources().getDimension(R.dimen.bubble_cell_radius), getResources().getDimension(R.dimen.bubble_cell_radius), 0.0f, 0.0f, 0.0f, 0.0f};
        this.g = new float[]{0.0f, 0.0f, 0.0f, 0.0f, getResources().getDimension(R.dimen.bubble_cell_radius), getResources().getDimension(R.dimen.bubble_cell_radius), getResources().getDimension(R.dimen.bubble_cell_radius), getResources().getDimension(R.dimen.bubble_cell_radius)};
        inflate(getContext(), R.layout.linkpreview_message_content_layout, this);
        this.a = (TextView) findViewById(R.id.linkpreview_message_text);
        this.b = (TextView) findViewById(R.id.linkpreview_title);
        this.c = (TextView) findViewById(R.id.linkpreview_description);
        this.d = (TextView) findViewById(R.id.linkpreview_domain);
        this.e = (ImageView) findViewById(R.id.linkpreview_image);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, dwhk.a, R.attr.linkPreviewBubbleCellTextContentStyle, R.style.LighterLinkPreviewBubbleCellTextMessage);
        setPadding(0, 0, 0, 0);
        this.h = typedArrayObtainStyledAttributes.getColor(5, eehg.b(this, R.attr.colorOnSurfaceInverse));
        this.i = typedArrayObtainStyledAttributes.getColor(7, eehg.b(this, R.attr.colorPrimary));
        this.k = typedArrayObtainStyledAttributes.getColor(1, eehg.b(this, R.attr.colorSurface));
        this.l = typedArrayObtainStyledAttributes.getResourceId(6, R.style.IncomingLinkPreviewBubbleCellTextMessage);
        this.m = typedArrayObtainStyledAttributes.getResourceId(8, R.style.OutgoingLinkPreviewBubbleCellTextMessage);
        this.n = typedArrayObtainStyledAttributes.getResourceId(4, R.style.LinkPreviewDescriptionTitleTextMessage);
        this.o = typedArrayObtainStyledAttributes.getResourceId(2, R.style.LinkPreviewDescriptionContentTextMessage);
        this.p = typedArrayObtainStyledAttributes.getResourceId(3, R.style.LinkPreviewDescriptionDomainTextMessage);
        typedArrayObtainStyledAttributes.recycle();
        int[] iArr = ley.a;
        setImportantForAccessibility(4);
    }

    @Override // defpackage.dwye
    public final /* synthetic */ void a(Object obj) {
        throw null;
    }

    @Override // defpackage.dxcd
    public final void b(dwqw dwqwVar) {
        ejwi ejwiVarA = dwgp.a(dwqwVar);
        if (ejwiVarA.g()) {
            TextView textView = this.a;
            textView.setText(((dwhd) ejwiVarA.c()).a);
            textView.setAutoLinkMask(15);
            TextView textView2 = this.b;
            textView2.setText(((dwhd) ejwiVarA.c()).b);
            TextView textView3 = this.c;
            textView3.setText(((dwhd) ejwiVarA.c()).c);
            TextView textView4 = this.d;
            textView4.setText(((dwhd) ejwiVarA.c()).e);
            ejwi ejwiVar = ((dwhd) ejwiVarA.c()).g;
            if (ejwiVar.g()) {
                ImageView imageView = this.e;
                imageView.setImageBitmap((Bitmap) ejwiVar.c());
                imageView.setVisibility(0);
                textView2.setVisibility(0);
                textView3.setVisibility(0);
                textView4.setVisibility(0);
            } else {
                this.e.setVisibility(8);
                textView2.setVisibility(0);
                textView3.setVisibility(0);
                textView4.setVisibility(0);
            }
            if (dwqwVar.s() == 1) {
                textView.setTextAppearance(this.l);
                this.j = this.h;
            } else {
                textView.setTextAppearance(this.m);
                this.j = this.i;
            }
            textView2.setTextAppearance(this.n);
            textView3.setTextAppearance(this.o);
            textView4.setTextAppearance(this.p);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setColor(this.j);
            gradientDrawable.setCornerRadii(this.f);
            textView.setPadding(dwyo.a(getContext(), 16.0f), dwyo.a(getContext(), 11.0f), dwyo.a(getContext(), 16.0f), dwyo.a(getContext(), 9.0f));
            textView.setWidth(dwyo.a(getContext(), 2.13116685E9f));
            textView.setBackground(gradientDrawable);
            int i = this.k;
            textView2.setBackgroundColor(i);
            textView3.setBackgroundColor(i);
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setShape(0);
            gradientDrawable2.setColor(i);
            gradientDrawable2.setCornerRadii(this.g);
            textView4.setBackground(gradientDrawable2);
            this.e.setBackgroundColor(i);
            setOnClickListener(new dwhl(this, ejwiVarA));
        }
    }

    @Override // defpackage.dwyw
    public final void c() {
        this.e.setImageDrawable(null);
    }

    @Override // defpackage.dxcd
    public final void d(float f, float f2, float f3, float f4) {
    }
}
