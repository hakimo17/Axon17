package com.axon17.ai;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.termux.view.TerminalView;
import com.termux.terminal.TerminalSession;
import java.io.File;

public class TerminalActivity extends AppCompatActivity {
    private TerminalView terminalView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terminal);

        terminalView = findViewById(R.id.terminal_view);
        
        // مسار العمل داخل التطبيق
        String workingDir = getFilesDir().getAbsolutePath();
        String[] env = {"PATH=/system/bin:/system/xbin:/data/data/com.axon17.ai/files/bin", "HOME=" + workingDir};
        
        // تشغيل شل أندرويد الحقيقي
        TerminalSession session = new TerminalSession("/system/bin/sh", workingDir, env, null);
        terminalView.attachSession(session);
    }
}
