package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebuf extends ea implements lzf {
    public ebue a;
    private ArrayAdapter b;

    @Override // defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.libraries_social_licenses_license_menu_fragment, viewGroup, false);
    }

    @Override // defpackage.lzf
    public final lzp a(int i, Bundle bundle) {
        return new ebuc(G());
    }

    @Override // defpackage.ea
    public final void ai() {
        super.ai();
        lzg.a(G()).b(54321);
    }

    @Override // defpackage.ea
    public final void ap(View view, Bundle bundle) {
        eg egVarG = G();
        this.b = new ArrayAdapter(egVarG, R.layout.libraries_social_licenses_license, R.id.license, new ArrayList());
        lzg.a(egVarG).c(54321, null, this);
        ListView listView = (ListView) view.findViewById(R.id.license_list);
        listView.setAdapter((ListAdapter) this.b);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: ebud
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view2, int i, long j) {
                ebua ebuaVar = (ebua) adapterView.getItemAtPosition(i);
                ebue ebueVar = this.a.a;
                if (ebueVar != null) {
                    ebueVar.B(ebuaVar);
                }
            }
        });
    }

    @Override // defpackage.lzf
    public final /* bridge */ /* synthetic */ void b(lzp lzpVar, Object obj) {
        this.b.clear();
        this.b.addAll((List) obj);
        this.b.notifyDataSetChanged();
    }

    @Override // defpackage.lzf
    public final void c(lzp lzpVar) {
        this.b.clear();
        this.b.notifyDataSetChanged();
    }

    @Override // defpackage.ea
    public final void g(Context context) {
        super.g(context);
        lvj lvjVar = this.E;
        if (lvjVar instanceof ebue) {
            this.a = (ebue) lvjVar;
            return;
        }
        kuk kukVarG = G();
        if (kukVarG instanceof ebue) {
            this.a = (ebue) kukVarG;
        }
    }

    @Override // defpackage.ea
    public final void j() {
        super.j();
        this.a = null;
    }
}
