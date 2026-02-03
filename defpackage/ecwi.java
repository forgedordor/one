package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecwi extends vo {
    private List a;

    @Override // defpackage.vo
    public final int a() {
        List list = this.a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // defpackage.vo
    public final /* bridge */ /* synthetic */ wv e(ViewGroup viewGroup, int i) {
        return new ecwh(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.survey_system_info_item, viewGroup, false));
    }

    @Override // defpackage.vo
    public final /* bridge */ /* synthetic */ void g(wv wvVar, int i) {
        lcb lcbVar = (lcb) this.a.get(i);
        View view = ((ecwh) wvVar).s;
        ((TextView) view.findViewById(R.id.survey_system_info_item_key)).setText((CharSequence) lcbVar.a);
        ((TextView) view.findViewById(R.id.survey_system_info_item_value)).setText((CharSequence) lcbVar.b);
    }

    public final void l(List list) {
        this.a = list;
        p();
    }
}
