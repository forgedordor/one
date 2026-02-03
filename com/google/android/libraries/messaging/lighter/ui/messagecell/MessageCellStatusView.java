package com.google.android.libraries.messaging.lighter.ui.messagecell;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.AppCompatTextView;
import android.text.SpannableString;
import android.text.format.DateUtils;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import com.google.android.apps.messaging.R;
import defpackage.dvhn;
import defpackage.dwhw;
import defpackage.dwqq;
import defpackage.dwyh;
import defpackage.dwyi;
import defpackage.dxby;
import defpackage.dxca;
import defpackage.eehg;
import defpackage.ejud;
import defpackage.ejwi;
import defpackage.fbfm;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class MessageCellStatusView extends AppCompatTextView {
    public static final long a = TimeUnit.MINUTES.toMillis(1);
    int b;
    public ejwi c;
    public long d;
    public dwqq e;
    private final String f;
    private final String g;
    private final String h;
    private final String i;
    private final String j;
    private final String k;
    private final int l;
    private final Runnable m;

    public MessageCellStatusView(Context context) {
        this(context, null);
    }

    private final SpannableString c(String str, String str2) {
        SpannableString spannableString = new SpannableString(getResources().getString(R.string.bullet_point_separated_text, str, str2));
        spannableString.setSpan(new StyleSpan(1), str.length() + 1, str.length() + 2, 256);
        return spannableString;
    }

    public final void a(boolean z) {
        setVisibility(true != z ? 8 : 0);
    }

    public final void b(String str) {
        CharSequence dateTime;
        if (this.e != null) {
            setTextAppearance(this.b);
            Context context = getContext();
            long j = this.d;
            dvhn.a();
            long jAbs = Math.abs(System.currentTimeMillis() - j);
            if (jAbs < 60000) {
                dateTime = context.getResources().getText(R.string.recent_message_timestamp_text);
            } else if (jAbs < 3600000) {
                long j2 = jAbs / 60000;
                dateTime = String.format(context.getResources().getQuantityString(R.plurals.lt_num_minutes_ago, (int) j2), Long.valueOf(j2));
            } else {
                dateTime = dwyi.a(j) ? DateUtils.formatDateTime(context, j, 1) : jAbs < 604800000 ? DateUtils.formatDateTime(context, j, 32771) : jAbs < 31449600000L ? DateUtils.formatDateTime(context, j, 65560) : DateUtils.formatDateTime(context, j, 65556);
            }
            dwqq dwqqVar = dwqq.INVALID;
            switch (this.e.ordinal()) {
                case 1:
                case 2:
                case 3:
                    setText(dateTime);
                    break;
                case 4:
                default:
                    a(false);
                    break;
                case 5:
                    setText("");
                    break;
                case 6:
                    setText(c(this.h, this.j));
                    setTextColor(this.l);
                    break;
                case 7:
                    setText(c(dateTime.toString(), this.f));
                    if (str != null) {
                        dwhw.a().c("MessagePerceivedSentLatency", str);
                        break;
                    }
                    break;
                case 8:
                    setText(c(dateTime.toString(), this.g));
                    if (str != null) {
                        dwhw.a().c("MessagePerceivedDeliveredLatency", str);
                        break;
                    }
                    break;
                case 9:
                    setText(c(dateTime.toString(), this.i));
                    break;
                case 10:
                    setText(this.k);
                    setTextColor(this.l);
                    break;
            }
        }
    }

    public MessageCellStatusView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.bubbleCellStyle);
    }

    public MessageCellStatusView(Context context, AttributeSet attributeSet, int i) {
        super(dwyh.a(context, fbfm.i()), attributeSet, i);
        this.c = ejud.a;
        dxby dxbyVar = new dxby(this);
        this.m = dxbyVar;
        setPadding(getContext().getResources().getDimensionPixelSize(R.dimen.bubble_cell_status_start_end_padding), getContext().getResources().getDimensionPixelSize(R.dimen.bubble_cell_top_padding), getContext().getResources().getDimensionPixelSize(R.dimen.bubble_cell_status_start_end_padding), getContext().getResources().getDimensionPixelSize(R.dimen.bubble_cell_status_bottom_padding));
        this.f = getContext().getText(R.string.message_sent_success).toString();
        this.h = getContext().getText(R.string.message_sent_failed).toString();
        this.g = getContext().getText(R.string.message_sent_delivered).toString();
        this.i = getContext().getText(R.string.message_sent_read).toString();
        this.j = getContext().getText(R.string.lighter_tap_item_to_retry).toString();
        this.k = getContext().getText(R.string.message_delivery_failed).toString();
        this.l = eehg.b(this, R.attr.colorError);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, dxca.c, i, R.style.LighterBubbleCellStatus);
        this.b = typedArrayObtainStyledAttributes.getResourceId(0, R.style.LabelText);
        typedArrayObtainStyledAttributes.recycle();
        postDelayed(dxbyVar, a);
    }
}
