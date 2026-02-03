package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvjn implements View.OnClickListener {
    private final cogw a;
    private final View.OnClickListener b;
    private long c = -500;

    public cvjn(cogw cogwVar, View.OnClickListener onClickListener) {
        this.a = cogwVar;
        this.b = onClickListener;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        cogw cogwVar = this.a;
        if (cogwVar.f().toEpochMilli() - this.c >= 500) {
            this.c = cogwVar.f().toEpochMilli();
            this.b.onClick(view);
        }
    }
}
