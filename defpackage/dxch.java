package defpackage;

import android.net.Uri;
import android.text.Spannable;
import android.text.style.URLSpan;
import android.view.MotionEvent;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxch extends dxcg {
    private final dxce a;

    public dxch(dxce dxceVar) {
        this.a = dxceVar;
    }

    @Override // defpackage.fele, android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            int offsetForPosition = textView.getOffsetForPosition(motionEvent.getX(), motionEvent.getY());
            URLSpan[] uRLSpanArr = (URLSpan[]) spannable.getSpans(offsetForPosition, offsetForPosition, URLSpan.class);
            if (uRLSpanArr.length == 1) {
                URLSpan uRLSpan = uRLSpanArr[0];
                if (uRLSpan != null) {
                    dxce dxceVar = this.a;
                    Uri uri = Uri.parse(uRLSpan.getURL());
                    dxcf dxcfVar = dxceVar.a;
                    if (dxcfVar.h) {
                        dxba dxbaVar = (dxba) dxcfVar.g;
                        dxbaVar.b.b(dxbaVar.b(125).a());
                    } else {
                        dwyf dwyfVar = dxcfVar.g;
                        Integer num = (Integer) dxba.a.get(uri.getScheme());
                        dxba dxbaVar2 = (dxba) dwyfVar;
                        dwhr dwhrVar = dxbaVar2.b;
                        dwhp dwhpVarB = dxbaVar2.b(122);
                        dwhpVarB.k(num != null ? num.intValue() : 0);
                        dwhrVar.b(dwhpVarB.a());
                    }
                }
            }
        }
        return super.onTouchEvent(textView, spannable, motionEvent);
    }
}
