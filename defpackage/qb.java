package defpackage;

import android.os.AsyncTask;
import android.util.Log;
import android.util.Xml;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qb extends AsyncTask {
    final /* synthetic */ qc a;

    public qb(qc qcVar) {
        this.a = qcVar;
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) throws IOException {
        List list = (List) objArr[0];
        String str = (String) objArr[1];
        try {
            FileOutputStream fileOutputStreamOpenFileOutput = this.a.e.openFileOutput(str, 0);
            XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
            try {
                try {
                    try {
                        xmlSerializerNewSerializer.setOutput(fileOutputStreamOpenFileOutput, null);
                        xmlSerializerNewSerializer.startDocument("UTF-8", true);
                        xmlSerializerNewSerializer.startTag(null, "historical-records");
                        int size = list.size();
                        for (int i = 0; i < size; i++) {
                            pz pzVar = (pz) list.remove(0);
                            xmlSerializerNewSerializer.startTag(null, "historical-record");
                            xmlSerializerNewSerializer.attribute(null, "activity", pzVar.a.flattenToString());
                            xmlSerializerNewSerializer.attribute(null, "time", String.valueOf(pzVar.b));
                            xmlSerializerNewSerializer.attribute(null, "weight", String.valueOf(pzVar.c));
                            xmlSerializerNewSerializer.endTag(null, "historical-record");
                        }
                        xmlSerializerNewSerializer.endTag(null, "historical-records");
                        xmlSerializerNewSerializer.endDocument();
                        this.a.h = true;
                    } catch (IllegalStateException e) {
                        String str2 = qc.a;
                        StringBuilder sb = new StringBuilder();
                        sb.append("Error writing historical record file: ");
                        qc qcVar = this.a;
                        sb.append(qcVar.f);
                        Log.e(str2, sb.toString(), e);
                        qcVar.h = true;
                        if (fileOutputStreamOpenFileOutput != null) {
                        }
                    }
                } catch (IOException e2) {
                    String str3 = qc.a;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Error writing historical record file: ");
                    qc qcVar2 = this.a;
                    sb2.append(qcVar2.f);
                    Log.e(str3, sb2.toString(), e2);
                    qcVar2.h = true;
                    if (fileOutputStreamOpenFileOutput != null) {
                    }
                } catch (IllegalArgumentException e3) {
                    Log.e(qc.a, "Error writing historical record file: " + this.a.f, e3);
                    this.a.h = true;
                    if (fileOutputStreamOpenFileOutput != null) {
                    }
                }
                if (fileOutputStreamOpenFileOutput != null) {
                    try {
                        fileOutputStreamOpenFileOutput.close();
                    } catch (IOException unused) {
                    }
                }
            } catch (Throwable th) {
                this.a.h = true;
                if (fileOutputStreamOpenFileOutput != null) {
                    try {
                        fileOutputStreamOpenFileOutput.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (FileNotFoundException e4) {
            Log.e(qc.a, "Error writing historical record file: ".concat(String.valueOf(str)), e4);
        }
        return null;
    }
}
