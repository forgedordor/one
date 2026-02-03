package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.messaging.lighter.ui.messagecell.MessageCellStatusView;
import com.google.android.libraries.messaging.lighter.ui.messagecell.TimestampHeaderView;
import com.google.android.libraries.messaging.lighter.ui.messagecell.TopLabelView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxbx extends FrameLayout implements dxbu {
    public dwqw a;
    public dxcd b;
    public final LinearLayout c;
    public final MessageCellStatusView d;
    public final TimestampHeaderView e;
    public final dwxz f;
    public final FrameLayout g;
    public final TopLabelView h;
    public final int i;
    public final int j;
    public final int k;
    private long l;

    public dxbx(Context context) {
        super(dwyh.a(context, fbfm.i()), null, R.attr.bubbleCellStyle);
        inflate(getContext(), R.layout.bubble_cell_layout, this);
        setPadding(getContext().getResources().getDimensionPixelSize(R.dimen.bubble_cell_start_end_padding), getContext().getResources().getDimensionPixelSize(R.dimen.bubble_cell_top_padding), getContext().getResources().getDimensionPixelSize(R.dimen.bubble_cell_start_end_padding), 0);
        this.c = (LinearLayout) findViewById(R.id.bubble_cell_wrapper);
        this.f = (dwxz) findViewById(R.id.message_avatar);
        this.d = (MessageCellStatusView) findViewById(R.id.bubble_cell_status_view);
        this.e = (TimestampHeaderView) findViewById(R.id.bubble_cell_tombstone_view);
        this.g = (FrameLayout) findViewById(R.id.message_content_wrapper);
        this.h = (TopLabelView) findViewById(R.id.top_label_layout);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, dxca.b, R.attr.bubbleCellStyle, R.style.LighterBubbleCell);
        this.i = typedArrayObtainStyledAttributes.getResourceId(2, R.style.UndefinedLabelText);
        this.j = typedArrayObtainStyledAttributes.getResourceId(1, R.style.DefaultLabelText);
        this.k = typedArrayObtainStyledAttributes.getResourceId(0, R.style.BotLabelText);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // defpackage.dwye
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(View view) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(getContext().getResources().getDimensionPixelSize(R.dimen.bubble_cell_start_end_padding), 0, getContext().getResources().getDimensionPixelSize(R.dimen.bubble_cell_start_end_padding), 0);
        view.setId(R.id.message_content);
        Object obj = this.b;
        if (obj != null) {
            this.g.removeView((View) obj);
        }
        this.b = (dxcd) view;
        this.g.addView(view, layoutParams);
    }

    @Override // defpackage.dwyw
    public final void c() {
        this.d.c = ejud.a;
        this.f.c();
        this.b.c();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            dvhn.a();
            this.l = System.currentTimeMillis();
        } else if (action == 1) {
            dvhn.a();
            if (System.currentTimeMillis() - this.l < 200) {
                if (this.a.i().equals(dwqq.OUTGOING_FAILED_SEND)) {
                    performClick();
                    return true;
                }
                if (this.a.h().a() == 2 && !((dxcf) this.g.getChildAt(0)).hasSelection()) {
                    performClick();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void setAlpha(float f) {
        super.setAlpha(1.0f);
    }
}
