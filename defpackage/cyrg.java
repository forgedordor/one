package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.support.v7.widget.AppCompatImageView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyrg extends vo {
    public final cyrn a;
    public final eigp d;
    public final fcsu e;
    public final Context f;
    public List g;
    private final cqjk h;
    private final fcsu i;
    private final String j;
    private final ekgp k;

    public cyrg(cyrn cyrnVar, cqjk cqjkVar, eigp eigpVar, fcsu fcsuVar, fcsu fcsuVar2, Context context) {
        this.a = cyrnVar;
        this.h = cqjkVar;
        this.d = eigpVar;
        this.e = fcsuVar;
        this.i = fcsuVar2;
        this.f = context;
        String string = context.getString(R.string.desktop_browser_type_unknown);
        string.getClass();
        this.j = string;
        this.k = ekgp.r(epnp.UNKNOWN, string, epnp.OTHER, context.getString(R.string.desktop_browser_type_other), epnp.CHROME, context.getString(R.string.desktop_browser_type_chrome), epnp.FIREFOX, context.getString(R.string.desktop_browser_type_firefox), epnp.SAFARI, context.getString(R.string.desktop_browser_type_safari), epnp.OPERA, context.getString(R.string.desktop_browser_type_opera), epnp.IE, context.getString(R.string.desktop_browser_type_ie), epnp.EDGE, context.getString(R.string.desktop_browser_type_edge));
        this.g = fcvo.a;
    }

    private static final epnp l(bvmr bvmrVar) {
        return epnp.b(bvmrVar.e);
    }

    @Override // defpackage.vo
    public final int a() {
        return this.g.size();
    }

    @Override // defpackage.vo
    public final wv e(ViewGroup viewGroup, int i) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gaia_paired_desktop_list_item_view, viewGroup, false);
        viewInflate.getClass();
        return new cyrf(viewInflate);
    }

    @Override // defpackage.vo
    public final void g(wv wvVar, int i) {
        PorterDuff.Mode mode;
        int iIntValue;
        wvVar.getClass();
        final bvmr bvmrVar = (bvmr) this.g.get(i);
        View view = wvVar.a;
        View viewFindViewById = view.findViewById(R.id.paired_desktop_list_item_name);
        viewFindViewById.getClass();
        TextView textView = (TextView) viewFindViewById;
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        String str = bvmrVar.b;
        if (str.length() == 0) {
            String str2 = (String) this.k.get(l(bvmrVar));
            if (str2 == null) {
                str2 = this.j;
            }
            sb2.append(str2);
        } else {
            sb2.append(str);
            String str3 = bvmrVar.c;
            if (str3.length() != 0) {
                sb2.append(" ");
                sb2.append(str3);
            }
        }
        sb.append(sb2.toString());
        String str4 = bvmrVar.h;
        if (str4 == null || str4.length() == 0) {
            String str5 = bvmrVar.i;
            if (str5 != null && str5.length() != 0) {
                sb.append(" (");
                sb.append(bvmrVar.i);
                sb.append(")");
            }
        } else {
            sb.append(" (");
            sb.append(bvmrVar.h);
            sb.append(")");
        }
        textView.setText(sb.toString());
        View viewFindViewById2 = view.findViewById(R.id.paired_desktop_list_item_icon);
        viewFindViewById2.getClass();
        AppCompatImageView appCompatImageView = (AppCompatImageView) viewFindViewById2;
        String str6 = bvmrVar.k;
        if (str6 == null || str6.length() == 0) {
            if (bvmrVar.d == bvdm.SATELLITE) {
                mode = PorterDuff.Mode.MULTIPLY;
                iIntValue = R.drawable.quantum_ic_tablet_android_white_36;
            } else {
                epnp epnpVarL = l(bvmrVar);
                Integer numValueOf = null;
                if (epnpVarL != null) {
                    int iOrdinal = epnpVarL.ordinal();
                    if (iOrdinal == 2) {
                        numValueOf = Integer.valueOf(R.drawable.product_logo_chrome_color_36);
                    } else if (iOrdinal == 3) {
                        numValueOf = Integer.valueOf(R.drawable.product_logo_mozilla_firefox_color_36);
                    } else if (iOrdinal == 4) {
                        numValueOf = Integer.valueOf(R.drawable.product_logo_apple_safari_color_36);
                    } else if (iOrdinal == 5) {
                        numValueOf = Integer.valueOf(R.drawable.product_logo_opera_color_36);
                    } else if (iOrdinal == 7) {
                        numValueOf = Integer.valueOf(R.drawable.product_logo_microsoft_edge_color_36);
                    }
                }
                if (numValueOf != null) {
                    iIntValue = numValueOf.intValue();
                    mode = PorterDuff.Mode.DST;
                } else {
                    mode = PorterDuff.Mode.MULTIPLY;
                    iIntValue = R.drawable.quantum_ic_desktop_windows_white_36;
                }
            }
            appCompatImageView.setImageResource(iIntValue);
            appCompatImageView.setImageTintMode(mode);
        } else {
            ((ehrb) this.i.b()).f(bvmrVar.k).v(appCompatImageView);
        }
        View viewFindViewById3 = view.findViewById(R.id.paired_desktop_list_item_location);
        viewFindViewById3.getClass();
        TextView textView2 = (TextView) viewFindViewById3;
        String str7 = bvmrVar.j;
        if (str7 == null || str7.length() == 0) {
            textView2.setText("");
            textView2.setVisibility(8);
        } else {
            textView2.setText(bvmrVar.j);
            textView2.setVisibility(0);
        }
        View viewFindViewById4 = view.findViewById(R.id.paired_desktop_list_item_connection_time);
        viewFindViewById4.getClass();
        Instant instant = bvmrVar.f;
        TextView textView3 = (TextView) viewFindViewById4;
        if (instant.compareTo(Instant.EPOCH) == 0) {
            Context context = this.f;
            textView3.setText(context.getString(R.string.paired_desktops_last_connection_time, context.getString(R.string.paired_desktops_last_connection_time_unknown)));
        } else {
            textView3.setText(this.f.getString(R.string.paired_desktops_last_connection_time, this.h.c(instant.toEpochMilli())));
        }
        View viewFindViewById5 = view.findViewById(R.id.delete_paired_desktop_button);
        viewFindViewById5.getClass();
        ImageView imageView = (ImageView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.paired_desktop_list_item_name);
        viewFindViewById6.getClass();
        final TextView textView4 = (TextView) viewFindViewById6;
        imageView.setContentDescription(this.f.getResources().getString(R.string.unpair_paired_desktop_button_content_description, textView4.getText()));
        imageView.setOnClickListener(new View.OnClickListener() { // from class: cyre
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) throws Resources.NotFoundException {
                CharSequence text = textView4.getText();
                text.getClass();
                final cyrg cyrgVar = this.a;
                ((ains) cyrgVar.e.b()).c("Bugle.Gaia.Unpair.Button.Clicked");
                Context context2 = cyrgVar.f;
                eeji eejiVar = new eeji(context2);
                eejiVar.v(context2.getResources().getString(R.string.delete_paired_desktop_dialog_title));
                eejiVar.l(context2.getResources().getString(R.string.delete_paired_desktop_dialog_content, text));
                String string = context2.getResources().getString(R.string.delete_paired_desktop_positive_button_text);
                final bvmr bvmrVar2 = bvmrVar;
                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: cyrc
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        cyrg cyrgVar2 = cyrgVar;
                        ((ains) cyrgVar2.e.b()).c("Bugle.Gaia.Unpair.Button.Confirmed");
                        List listB = fcva.b(bvmrVar2);
                        cysg cysgVarH = cyrgVar2.a.H();
                        ArrayList arrayList = new ArrayList(fcva.p(listB, 10));
                        Iterator it = listB.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((bvmr) it.next()).a);
                        }
                        cysgVarH.a(arrayList);
                    }
                };
                eigp eigpVar = cyrgVar.d;
                eejiVar.s(string, new eigf(eigpVar, "", "", 0, "GaiaPairedDesktopsAdapter.confirm_signout", onClickListener));
                eejiVar.n(context2.getResources().getString(R.string.delete_paired_desktop_negative_button_text), new eigf(eigpVar, "", "", 0, "GaiaPairedDesktopsAdapter.cancel_signout", new DialogInterface.OnClickListener() { // from class: cyrd
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        ((ains) cyrgVar.e.b()).c("Bugle.Gaia.Unpair.Button.Cancelled");
                        dialogInterface.dismiss();
                    }
                }));
                eejiVar.a();
            }
        });
    }
}
