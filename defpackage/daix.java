package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class daix extends LayoutInflater {
    static final String[] a = {"android.widget.", "android.webkit.", "android.app."};

    public daix(Context context) {
        super(context);
    }

    @Override // android.view.LayoutInflater
    public final LayoutInflater cloneInContext(Context context) {
        return new daix(context);
    }

    @Override // android.view.LayoutInflater
    protected final View onCreateView(String str, AttributeSet attributeSet) {
        View viewCreateView;
        String[] strArr = a;
        for (int i = 0; i < 3; i++) {
            try {
                viewCreateView = createView(str, strArr[i], attributeSet);
            } catch (ClassNotFoundException unused) {
            }
            if (viewCreateView != null) {
                return viewCreateView;
            }
        }
        return super.onCreateView(str, attributeSet);
    }
}
