package defpackage;

import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.conversation.simpicker.SimIconView;
import com.google.android.apps.messaging.conversation.simpicker.SimPickerItemView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class utx {
    public final cpga a;
    public final einm b;
    public final SimPickerItemView c;
    public final TextView d;
    public final TextView e;
    public final SimIconView f;
    public final alrj g;

    public utx(cpga cpgaVar, einm einmVar, SimPickerItemView simPickerItemView, alrj alrjVar) {
        this.a = cpgaVar;
        this.b = einmVar;
        this.c = simPickerItemView;
        this.g = alrjVar;
        this.e = (TextView) simPickerItemView.findViewById(R.id.name);
        this.d = (TextView) simPickerItemView.findViewById(R.id.details);
        this.f = (SimIconView) simPickerItemView.findViewById(R.id.sim_icon);
    }
}
