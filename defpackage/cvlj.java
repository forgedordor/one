package defpackage;

import android.text.TextWatcher;
import android.widget.CompoundButton;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface cvlj extends TextView.OnEditorActionListener, TextWatcher, CompoundButton.OnCheckedChangeListener, bago, cvtk {
    public static final String[] sA = {"image/gif", "image/jpeg", "image/png", "video/mp4"};

    String c();

    void e(String str);

    void f(boolean z);

    void g(boolean z);

    boolean h();

    boolean i();
}
