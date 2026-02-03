package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AlertController;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes.dex */
public class iu {
    public final ir a;
    private final int b;

    public iu(Context context) {
        this(context, iv.a(context, 0));
    }

    public final iv a() {
        iv ivVarCreate = create();
        ivVarCreate.show();
        return ivVarCreate;
    }

    public final void b(Drawable drawable) {
        this.a.d = drawable;
    }

    public final void c(CharSequence charSequence) {
        this.a.g = charSequence;
    }

    public iv create() {
        ListAdapter ioVar;
        ir irVar = this.a;
        Context context = irVar.a;
        iv ivVar = new iv(context, this.b);
        AlertController alertController = ivVar.a;
        View view = irVar.f;
        if (view != null) {
            alertController.y = view;
        } else {
            CharSequence charSequence = irVar.e;
            if (charSequence != null) {
                alertController.a(charSequence);
            }
            Drawable drawable = irVar.d;
            if (drawable != null) {
                alertController.u = drawable;
                alertController.t = 0;
                ImageView imageView = alertController.v;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    alertController.v.setImageDrawable(drawable);
                }
            }
            int i = irVar.c;
            if (i != 0) {
                alertController.u = null;
                alertController.t = i;
                ImageView imageView2 = alertController.v;
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                    alertController.v.setImageResource(alertController.t);
                }
            }
        }
        CharSequence charSequence2 = irVar.g;
        if (charSequence2 != null) {
            alertController.e = charSequence2;
            TextView textView = alertController.x;
            if (textView != null) {
                textView.setText(charSequence2);
            }
        }
        CharSequence charSequence3 = irVar.h;
        if (charSequence3 != null) {
            alertController.f(-1, charSequence3, irVar.i);
        }
        CharSequence charSequence4 = irVar.j;
        if (charSequence4 != null) {
            alertController.f(-2, charSequence4, irVar.k);
        }
        CharSequence charSequence5 = irVar.l;
        if (charSequence5 != null) {
            alertController.f(-3, charSequence5, irVar.m);
        }
        if (irVar.r != null || irVar.s != null) {
            AlertController.RecycleListView recycleListView = (AlertController.RecycleListView) irVar.b.inflate(alertController.D, (ViewGroup) null);
            if (irVar.w) {
                ioVar = new io(irVar, context, alertController.E, irVar.r, recycleListView);
            } else {
                int i2 = irVar.x ? alertController.F : alertController.G;
                ListAdapter itVar = irVar.s;
                if (itVar == null) {
                    itVar = new it(context, i2, irVar.r);
                }
                ioVar = itVar;
            }
            alertController.z = ioVar;
            alertController.A = irVar.y;
            if (irVar.t != null) {
                recycleListView.setOnItemClickListener(new ip(irVar, alertController));
            } else if (irVar.z != null) {
                recycleListView.setOnItemClickListener(new iq(irVar, recycleListView, alertController));
            }
            if (irVar.x) {
                recycleListView.setChoiceMode(1);
            } else if (irVar.w) {
                recycleListView.setChoiceMode(2);
            }
            alertController.f = recycleListView;
        }
        View view2 = irVar.u;
        if (view2 != null) {
            alertController.b(view2);
        }
        ivVar.setCancelable(irVar.n);
        if (irVar.n) {
            ivVar.setCanceledOnTouchOutside(true);
        }
        ivVar.setOnCancelListener(irVar.o);
        ivVar.setOnDismissListener(irVar.p);
        DialogInterface.OnKeyListener onKeyListener = irVar.q;
        if (onKeyListener != null) {
            ivVar.setOnKeyListener(onKeyListener);
        }
        return ivVar;
    }

    public final void d(int i, DialogInterface.OnClickListener onClickListener) {
        ir irVar = this.a;
        irVar.l = irVar.a.getText(i);
        irVar.m = onClickListener;
    }

    public final void e(int i) {
        ir irVar = this.a;
        irVar.e = irVar.a.getText(i);
    }

    public final void f(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        ir irVar = this.a;
        irVar.j = charSequence;
        irVar.k = onClickListener;
    }

    public final void g(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        ir irVar = this.a;
        irVar.h = charSequence;
        irVar.i = onClickListener;
    }

    public Context getContext() {
        return this.a.a;
    }

    public final void h(CharSequence[] charSequenceArr, int i, DialogInterface.OnClickListener onClickListener) {
        ir irVar = this.a;
        irVar.r = charSequenceArr;
        irVar.t = onClickListener;
        irVar.y = i;
        irVar.x = true;
    }

    public iu setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
        ir irVar = this.a;
        irVar.j = irVar.a.getText(i);
        irVar.k = onClickListener;
        return this;
    }

    public iu setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
        ir irVar = this.a;
        irVar.h = irVar.a.getText(i);
        irVar.i = onClickListener;
        return this;
    }

    public iu setTitle(CharSequence charSequence) {
        this.a.e = charSequence;
        return this;
    }

    public iu setView(View view) {
        this.a.u = view;
        return this;
    }

    public iu(Context context, int i) {
        this.a = new ir(new ContextThemeWrapper(context, iv.a(context, i)));
        this.b = i;
    }
}
