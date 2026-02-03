package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.StateSet;
import com.google.android.apps.messaging.R;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvjl implements cqci {
    public final Resources a;
    private final Context b;
    private final fcsu c;

    public cvjl(Context context, fcsu fcsuVar) throws Resources.NotFoundException {
        this.b = context;
        this.a = context.getResources();
        this.c = fcsuVar;
        g();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int a(java.lang.String r1) {
        /*
            int r0 = r1.hashCode()
            switch(r0) {
                case -1248341670: goto L89;
                case -1248334925: goto L7f;
                case -1248330447: goto L74;
                case -1248329177: goto L6a;
                case -1073633483: goto L5f;
                case -1071817359: goto L54;
                case -1050893613: goto L49;
                case -958424608: goto L3f;
                case 262346941: goto L35;
                case 326991069: goto L2b;
                case 904647503: goto L20;
                case 1639365779: goto L15;
                case 1993842850: goto L9;
                default: goto L7;
            }
        L7:
            goto L93
        L9:
            java.lang.String r0 = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L93
            r1 = 11
            goto L94
        L15:
            java.lang.String r0 = "application/hbs-vcs"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L93
            r1 = 6
            goto L94
        L20:
            java.lang.String r0 = "application/msword"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L93
            r1 = 7
            goto L94
        L2b:
            java.lang.String r0 = "text/x-vCalendar"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L93
            r1 = 2
            goto L94
        L35:
            java.lang.String r0 = "text/x-vcalendar"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L93
            r1 = 3
            goto L94
        L3f:
            java.lang.String r0 = "text/calendar"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L93
            r1 = 1
            goto L94
        L49:
            java.lang.String r0 = "application/vnd.openxmlformats-officedocument.wordprocessingml.document"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L93
            r1 = 8
            goto L94
        L54:
            java.lang.String r0 = "application/vnd.ms-powerpoint"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L93
            r1 = 9
            goto L94
        L5f:
            java.lang.String r0 = "application/vnd.openxmlformats-officedocument.presentationml.presentation"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L93
            r1 = 10
            goto L94
        L6a:
            java.lang.String r0 = "application/vcs"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L93
            r1 = 5
            goto L94
        L74:
            java.lang.String r0 = "application/txt"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L93
            r1 = 12
            goto L94
        L7f:
            java.lang.String r0 = "application/pdf"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L93
            r1 = 0
            goto L94
        L89:
            java.lang.String r0 = "application/ics"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L93
            r1 = 4
            goto L94
        L93:
            r1 = -1
        L94:
            switch(r1) {
                case 0: goto Laf;
                case 1: goto Lab;
                case 2: goto Lab;
                case 3: goto Lab;
                case 4: goto Lab;
                case 5: goto Lab;
                case 6: goto Lab;
                case 7: goto La7;
                case 8: goto La7;
                case 9: goto La3;
                case 10: goto La3;
                case 11: goto L9f;
                case 12: goto L9b;
                default: goto L97;
            }
        L97:
            r1 = 2131232470(0x7f0806d6, float:1.808105E38)
            return r1
        L9b:
            r1 = 2131232439(0x7f0806b7, float:1.8080987E38)
            return r1
        L9f:
            r1 = 2131232438(0x7f0806b6, float:1.8080985E38)
            return r1
        La3:
            r1 = 2131232437(0x7f0806b5, float:1.8080983E38)
            return r1
        La7:
            r1 = 2131232435(0x7f0806b3, float:1.808098E38)
            return r1
        Lab:
            r1 = 2131232456(0x7f0806c8, float:1.8081022E38)
            return r1
        Laf:
            r1 = 2131232436(0x7f0806b4, float:1.8080981E38)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvjl.a(java.lang.String):int");
    }

    public static int b(Context context) {
        return eehg.d(context, R.attr.colorPrimaryBrandIcon, "ConversationDrawables");
    }

    public static Drawable c(Context context) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        int dimension = (int) context.getResources().getDimension(R.dimen.file_icon_background_size);
        shapeDrawable.setIntrinsicHeight(dimension);
        shapeDrawable.setIntrinsicWidth(dimension);
        return cqsu.i(context, shapeDrawable, eehg.d(context, R.attr.colorPrimaryBrandIcon, "ConversationDrawables"));
    }

    public static GradientDrawable f(int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(i);
        return gradientDrawable;
    }

    public final Drawable d(Context context, int i, boolean z) {
        Drawable drawableA;
        if (z) {
            bwdo bwdoVar = (bwdo) this.c.b();
            Optional optional = bwdoVar.b;
            if (optional.isEmpty()) {
                throw new IllegalStateException("Cannot provide scheduled send button icon with missing ScheduledSendResources. Is the module missing?");
            }
            Context context2 = bwdoVar.a;
            optional.get();
            drawableA = context2.getDrawable(R.drawable.scheduled_send_button_icon);
            drawableA.getClass();
        } else {
            drawableA = ((bwdo) this.c.b()).a(i);
        }
        Drawable drawableI = cqsu.i(context, drawableA, b(context));
        Drawable drawableI2 = cqsu.i(context, drawableA, context.getColor(R.color.c2o_send_button_disabled_color_m2));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{-16842910}, drawableI2);
        stateListDrawable.addState(StateSet.WILD_CARD, drawableI);
        return stateListDrawable;
    }

    public final Drawable e() {
        return f(this.b.getColor(R.color.primary_brand_icon_color));
    }

    public final void g() throws Resources.NotFoundException {
        Resources resources = this.a;
        resources.getDimension(R.dimen.conversation_bubble_small_corner);
        resources.getDimension(R.dimen.conversation_bubble_large_corner);
    }

    @Override // defpackage.cqci
    public final void i(int i) {
    }
}
