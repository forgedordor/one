package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import defpackage.krv;
import defpackage.ktc;
import defpackage.ktt;

/* compiled from: PG */
/* loaded from: classes.dex */
public class Barrier extends ktc {
    public int a;
    public krv b;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // defpackage.ktc
    protected final void a(AttributeSet attributeSet) throws IllegalAccessException, NoSuchFieldException, Resources.NotFoundException, IllegalArgumentException {
        super.a(attributeSet);
        this.b = new krv();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, ktt.b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 26) {
                    this.a = typedArrayObtainStyledAttributes.getInt(26, 0);
                } else if (index == 25) {
                    this.b.b = typedArrayObtainStyledAttributes.getBoolean(25, true);
                } else if (index == 27) {
                    this.b.c = typedArrayObtainStyledAttributes.getDimensionPixelSize(27, 0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.i = this.b;
        k();
    }

    public final void b(int i) {
        this.b.c = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x000a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0011  */
    @Override // defpackage.ktc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.krz r6, boolean r7) {
        /*
            r5 = this;
            int r0 = r5.a
            r1 = 1
            r2 = 0
            r3 = 6
            r4 = 5
            if (r7 == 0) goto Lf
            if (r0 != r4) goto Lc
        La:
            r0 = r1
            goto L16
        Lc:
            if (r0 != r3) goto L16
            goto L11
        Lf:
            if (r0 != r4) goto L13
        L11:
            r0 = r2
            goto L16
        L13:
            if (r0 != r3) goto L16
            goto La
        L16:
            boolean r7 = r6 instanceof defpackage.krv
            if (r7 == 0) goto L1e
            krv r6 = (defpackage.krv) r6
            r6.a = r0
        L1e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.Barrier.c(krz, boolean):void");
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }
}
