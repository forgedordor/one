package defpackage;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rv {
    public TextClassifier a;
    private final TextView b;

    public rv(TextView textView) {
        this.b = textView;
    }

    public final TextClassifier a() {
        TextClassifier textClassifier = this.a;
        if (textClassifier != null) {
            return textClassifier;
        }
        TextClassificationManager textClassificationManagerM512m = iy$$ExternalSyntheticApiModelOutline1.m512m(this.b.getContext().getSystemService(nh$$ExternalSyntheticApiModelOutline0.m605m()));
        return textClassificationManagerM512m != null ? textClassificationManagerM512m.getTextClassifier() : TextClassifier.NO_OP;
    }
}
