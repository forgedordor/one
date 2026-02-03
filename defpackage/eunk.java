package defpackage;

import android.text.style.BackgroundColorSpan;
import android.text.style.CharacterStyle;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eunk extends BackgroundColorSpan {
    private static final CharacterStyle a = new eunj();

    public eunk(int i) {
        super(i);
    }

    @Override // android.text.style.CharacterStyle
    public final CharacterStyle getUnderlying() {
        return a;
    }
}
