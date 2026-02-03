package defpackage;

import android.os.ParcelFileDescriptor;
import android.util.Pair;
import com.google.android.gms.feedback.FileTeleporter;
import j$.util.Optional;
import java.io.DataInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuha implements cdfg {
    static final ejxr a = cdag.x("enable_text_classifier_psbd");
    static final cczv b = cdag.g(cdag.b, "text_classifier_mdd_group_name", "text_classifier");
    public static final /* synthetic */ int c = 0;
    private final fcsu d;
    private final eosc e;

    public cuha(fcsu fcsuVar, eosc eoscVar) {
        this.d = fcsuVar;
        this.e = eoscVar;
    }

    public final eiju a() {
        if (((Boolean) ((cczi) a.get()).e()).booleanValue()) {
            return ((cdte) this.d.b()).h((String) b.e()).h(new ejvr() { // from class: cugz
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    Optional optional = (Optional) obj;
                    int i = cuha.c;
                    StringBuilder sb = new StringBuilder();
                    if (optional.isPresent()) {
                        sb.append("TextClassifierFileGroupStatus = ");
                        dtlz dtlzVarB = dtlz.b(((dtma) optional.get()).g);
                        if (dtlzVarB == null) {
                            dtlzVarB = dtlz.UNSPECIFIED;
                        }
                        sb.append(dtlzVarB.name());
                        sb.append("\nVersionNumber = ");
                        sb.append(((dtma) optional.get()).f);
                        sb.append("\n");
                        for (dtlw dtlwVar : ((dtma) optional.get()).h) {
                            sb.append("MddFile: ");
                            sb.append(dtlwVar.c);
                            sb.append(", size: ");
                            sb.append(dtlwVar.e);
                            sb.append("\n");
                        }
                    } else {
                        sb.append("TextClassifierFileGroupStatus = Not Present\n");
                    }
                    return ekgb.r(new FileTeleporter(sb.toString().getBytes(), "text_classifier_psbd"));
                }
            }, this.e);
        }
        int i = ekgb.d;
        return eijx.e(ekoe.a);
    }

    @Override // defpackage.cdfg
    public final eiju b() {
        return a().h(new ejvr() { // from class: cugy
            @Override // defpackage.ejvr
            public final Object apply(Object obj) throws IOException {
                Pair pairCreate;
                int i = cuha.c;
                StringBuilder sb = new StringBuilder();
                for (FileTeleporter fileTeleporter : (List) obj) {
                    if (fileTeleporter.a == null) {
                        pairCreate = Pair.create(fileTeleporter.c, Pair.create(fileTeleporter.b, fileTeleporter.d));
                    } else {
                        DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(fileTeleporter.a));
                        try {
                            try {
                                byte[] bArr = new byte[dataInputStream.readInt()];
                                String utf = dataInputStream.readUTF();
                                String utf2 = dataInputStream.readUTF();
                                dataInputStream.read(bArr);
                                fileTeleporter.a(dataInputStream);
                                pairCreate = Pair.create(utf2, Pair.create(utf, bArr));
                            } catch (IOException e) {
                                throw new IllegalStateException("Could not read from parcel file descriptor", e);
                            }
                        } catch (Throwable th) {
                            fileTeleporter.a(dataInputStream);
                            throw th;
                        }
                    }
                    sb.append("\nSection: ");
                    sb.append((String) pairCreate.first);
                    sb.append("\n");
                    sb.append(new String((byte[]) ((Pair) pairCreate.second).second, StandardCharsets.UTF_8));
                }
                return sb.toString();
            }
        }, this.e);
    }

    @Override // defpackage.cdfg
    public final eiju c() {
        return a();
    }

    @Override // defpackage.cdfg
    public final /* synthetic */ eiju d() {
        return cdfd.d();
    }
}
