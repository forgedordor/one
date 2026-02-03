package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Locale;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtxb extends mj {
    public static final mr d = new dtwz();
    public dtya e;
    private final Context f;

    public dtxb(Context context, Executor executor) {
        mb mbVar = new mb(d);
        mbVar.a = executor;
        super(mbVar.a());
        this.e = null;
        this.f = context;
    }

    @Override // defpackage.vo
    public final /* bridge */ /* synthetic */ wv e(ViewGroup viewGroup, int i) {
        return new dtxa(LayoutInflater.from(this.f).inflate(R.layout.mdd_debug_list_item_view, viewGroup, false));
    }

    @Override // defpackage.vo
    public final /* bridge */ /* synthetic */ void g(wv wvVar, final int i) {
        View view;
        boolean z;
        dtma dtmaVar = (dtma) b(i);
        View view2 = ((dtxa) wvVar).s;
        TextView textView = (TextView) view2.findViewById(R.id.group_name);
        TextView textView2 = (TextView) view2.findViewById(R.id.locale);
        TextView textView3 = (TextView) view2.findViewById(R.id.download_account);
        TextView textView4 = (TextView) view2.findViewById(R.id.variant_id);
        TextView textView5 = (TextView) view2.findViewById(R.id.build_id);
        LinearLayout linearLayout = (LinearLayout) view2.findViewById(R.id.variant_container);
        LinearLayout linearLayout2 = (LinearLayout) view2.findViewById(R.id.build_container);
        LinearLayout linearLayout3 = (LinearLayout) view2.findViewById(R.id.locale_container);
        TextView textView6 = (TextView) view2.findViewById(R.id.download_status);
        TextView textView7 = (TextView) view2.findViewById(R.id.version_number);
        TextView textView8 = (TextView) view2.findViewById(R.id.file_count);
        if ((dtmaVar.b & 1) == 0 || dtmaVar.c.isEmpty()) {
            view = view2;
            z = false;
        } else {
            view = view2;
            z = true;
        }
        ejwl.b(z, "Invalid Metadata");
        textView.setText(dtmaVar.c);
        linearLayout3.setVisibility(true != dtmaVar.k.isEmpty() ? 0 : 8);
        textView2.setText(dtmaVar.k.toString());
        if ((dtmaVar.b & 4) != 0) {
            textView3.setText(dtmaVar.e);
        } else {
            textView3.setText(R.string.list_item_no_account);
        }
        linearLayout2.setVisibility(dtmaVar.i == 0 ? 8 : 0);
        textView5.setText(String.format(Locale.ENGLISH, "%d", Long.valueOf(dtmaVar.i)));
        linearLayout.setVisibility(true != dtmaVar.j.isEmpty() ? 0 : 8);
        textView4.setText(dtmaVar.j);
        if ((dtmaVar.b & 16) != 0) {
            dtlz dtlzVarB = dtlz.b(dtmaVar.g);
            if (dtlzVarB == null) {
                dtlzVarB = dtlz.UNSPECIFIED;
            }
            int i2 = dtlzVarB.e;
            textView6.setText(i2 != 1 ? i2 != 2 ? "Unspecified" : "Pending" : "Downloaded");
        } else {
            textView6.setText(android.R.string.unknownName);
        }
        if ((dtmaVar.b & 8) != 0) {
            textView7.setText(String.format(Locale.ENGLISH, "%d", Integer.valueOf(dtmaVar.f)));
        } else {
            textView7.setText(android.R.string.unknownName);
        }
        Resources resources = this.f.getResources();
        int size = dtmaVar.h.size();
        textView8.setText(resources.getQuantityString(R.plurals.list_item_file_count, size, Integer.valueOf(size)));
        view.setOnClickListener(new View.OnClickListener() { // from class: dtwy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                dtxb dtxbVar = this.a;
                dtma dtmaVar2 = (dtma) dtxbVar.b(i);
                dtya dtyaVar = dtxbVar.e;
                if (dtyaVar != null) {
                    ((ekrd) ((ekrd) dtxx.a.e()).h("com/google/android/libraries/mdi/download/debug/common/filegroups/MddDebugListFragmentActionProviderImpl", "downloadFileGroup", 116, "MddDebugListFragmentActionProviderImpl.java")).t("Downloading File Group %s...", dtmaVar2.c);
                    dtxx dtxxVar = (dtxx) dtyaVar.a;
                    ejtj ejtjVar = dtxxVar.f;
                    final dtxq dtxqVar = dtxxVar.g;
                    ejtjVar.c(ejtj.a(eika.k(dtxqVar.b.b(dtmaVar2), new eooz() { // from class: dtxn
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj) {
                            return dtxqVar.a();
                        }
                    }, dtxqVar.a)), dtxxVar.b, "MDD.DEBUG.DOWNLOAD_ACTION");
                }
            }
        });
    }
}
