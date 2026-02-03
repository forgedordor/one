package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.lang.reflect.InvocationTargetException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class onk extends onj {
    private final iy a;

    /* JADX WARN: Illegal instructions before constructor call */
    public onk(iy iyVar, onl onlVar) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Context contextU = iyVar.hc().a.u();
        contextU.getClass();
        super(contextU, onlVar);
        this.a = iyVar;
    }

    @Override // defpackage.onj
    protected final void b(Drawable drawable, int i) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        iy iyVar = this.a;
        im imVarK = iyVar.k();
        if (imVarK == null) {
            throw new IllegalStateException(a.h(iyVar, "Activity ", " does not have an ActionBar set via setSupportActionBar()"));
        }
        imVarK.setDisplayHomeAsUpEnabled(drawable != null);
        im imVarB = iyVar.hc().a.b();
        if (imVarB != null) {
            imVarB.setHomeAsUpIndicator(drawable);
            imVarB.setHomeActionContentDescription(i);
        }
    }

    @Override // defpackage.onj
    protected final void c(CharSequence charSequence) {
        iy iyVar = this.a;
        im imVarK = iyVar.k();
        if (imVarK == null) {
            throw new IllegalStateException(a.h(iyVar, "Activity ", " does not have an ActionBar set via setSupportActionBar()"));
        }
        imVarK.setTitle(charSequence);
    }
}
